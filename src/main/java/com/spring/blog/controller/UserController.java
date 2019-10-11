package com.spring.blog.controller;

import com.spring.blog.entity.User;
import com.spring.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/user")
    public List<User> list() {
//        List<User> users = userService.findAll();
//        return users;
        return userService.findAll();
    }
    @RequestMapping("/checkLoginName")
    public boolean checkLogin1(@RequestBody Map map) {
        User user = new User();
        user.setUserName((String)map.get("userName"));
        user.setUserPassword((String)map.get("userPassword"));
        return userService.findByNameAndPassword(user)==1;
    }
    @RequestMapping("/checkLoginPhone")
    public boolean checkLogin2(@RequestBody Map map) {
        User user = new User();
        user.setUserPhone((String)map.get("userPhone"));
        user.setUserPassword((String)map.get("userPassword"));
        return userService.findByPhoneAndPassword(user)==1;
    }
    @RequestMapping("/checkLoginEmail")
    public boolean checkLogin3(@RequestBody Map map) {
        User user = new User();
        user.setUserEmail((String)map.get("userEmail"));
        user.setUserPassword((String)map.get("userPassword"));
        return userService.findByEmailAndPassword(user)==1;
    }
    @RequestMapping("/checkUserNameExist")
    public boolean checkUserNameExist(@RequestBody Map map) {
        User user = new User();
        user.setUserName((String)map.get("userName"));
        return userService.checkUserNameExist(user)==0;
    }
    @RequestMapping("/checkUserPhoneExist")
    public boolean checkUserPhoneExist(@RequestBody Map map) {
        User user = new User();
        user.setUserPhone((String)map.get("userPhone"));
        return userService.checkUserPhoneExist(user)==0;
    }
    @RequestMapping("/checkUserEmailExist")
    public boolean checkUserEmailExist(@RequestBody Map map) {
        User user = new User();
        user.setUserEmail((String)map.get("userEmail"));
        return userService.checkUserEmailExist(user)==0;
    }
    @RequestMapping("/registWithoutImg")
    public boolean registWithoutImg(HttpServletRequest request) {
        User user = new User();
        user.setUserName(request.getParameter("userName"));
        user.setUserPassword(request.getParameter("userPassword"));
        user.setUserPhone(request.getParameter("userPhone"));
        user.setUserEmail(request.getParameter("userEmail"));
        user.setUserRegistTime(request.getParameter("userRegistTime"));
        user.setUserNickname(request.getParameter("userNickname"));
        String userImage = "http://www.diacloud.club:8080/images/defaultImage.jpg";
        user.setUserImage(userImage);

        userService.regist(user);
        return true;


    }

    @RequestMapping("/regist")
    public boolean regist(HttpServletRequest request, @RequestParam(value = "file",required = false) MultipartFile file) throws IOException {
        User user = new User();
        user.setUserName(request.getParameter("userName"));
        user.setUserPassword(request.getParameter("userPassword"));
        user.setUserPhone(request.getParameter("userPhone"));
        user.setUserEmail(request.getParameter("userEmail"));
        user.setUserRegistTime(request.getParameter("userRegistTime"));
        user.setUserNickname(request.getParameter("userNickname"));
        String fileName = "";
        // 获取文件名
        try {
            fileName = file.getOriginalFilename();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 设置上传路径
        String imageRoot = "/usr/tomcat/apache-tomcat-8.5.46/webapps/images";

//        String imageRoot = "D:\\myblog\\server\\src\\main\\resources\\static";
        // 获取文件后缀
        String type = fileName.indexOf(".") != -1 ? fileName.substring(fileName.lastIndexOf(".") + 1) : null;
        String str = "";
        // 拼接文件名(uuid 避免文件名重复)
        try{
            str = fileName.substring(fileName.lastIndexOf("."));
        } catch (Exception e) {
            e.printStackTrace();
        }
        String imageFileName = UUID.randomUUID().toString() + str;

        // 文件地址组装 (包含文件名)
        String imageFilePath = imageRoot + "/" + imageFileName;

        // 装载实体类 User 的 userImage 属性
        String userImage = "http://www.diacloud.club:8080/images/" + imageFileName;
//        String userImage = "http://localhost:8081/" + imageFileName;
        user.setUserImage(userImage);

        if (type != null) {
            if ("JPG".equals(type.toUpperCase()) || "PNG".equals(type.toUpperCase()) || "JPEG".equals(type.toUpperCase())) {
                try {
                    //图片命名
                    String newCompanyImageName = imageFileName;
                    String newCompanyImagepath = imageFilePath;
                    File newFile = new File(newCompanyImagepath);
                    if (!newFile.exists()) {
                        newFile.createNewFile();
                    }
                    BufferedOutputStream out = new BufferedOutputStream(
                            new FileOutputStream(newFile));
                    out.write(file.getBytes());
                    out.flush();
                    out.close();
                    userService.regist(user);
                    return true;
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    return false;
                } catch (IOException e) {
                    e.printStackTrace();
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }


    }
    @GetMapping("/findByIdentity/{identity}")
    public User findByIdentity(@PathVariable("identity") String identity) {
        return userService.findByIdentity(identity);
    }

    @DeleteMapping("/deleteById/{userId}")
    public void deleteById(@PathVariable("userId") int userId) {
        userService.deleteById(userId);
    }

    @PutMapping("/updateAuthority1/{userId}")
    public void updateAuthority1(@PathVariable("userId") int userId) {
        userService.updateAuthority1(userId);
    }
    @PutMapping("/updateAuthority2/{userId}")
    public void updateAuthority2(@PathVariable("userId") int userId) {
        userService.updateAuthority2(userId);
    }
}
