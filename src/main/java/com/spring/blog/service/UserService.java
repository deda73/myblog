package com.spring.blog.service;

import com.spring.blog.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    List<User> findAll() ;

    /**
     * 使用 用户名 密码 验证登录
     * @param user
     * @return
     */
    int findByNameAndPassword(User user);

    int findByPhoneAndPassword(User user);
    int findByEmailAndPassword(User user);
    int checkUserNameExist(User user);

    int checkUserPhoneExist(User user);
    int checkUserEmailExist(User user);

    void regist(User user);
    User findByIdentity(String identity);

    void deleteById(int userId);
    void updateAuthority1(int userId);
    void updateAuthority2(int userId);
}
