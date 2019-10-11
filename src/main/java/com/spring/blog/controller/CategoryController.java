package com.spring.blog.controller;

import com.spring.blog.entity.Category;
import com.spring.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @GetMapping("/findAll")
    public List<Category> findAll() {
        return categoryService.findAll();
    }

    @DeleteMapping("/deleteById/{categoryId}")
    public void deleteById(@PathVariable("categoryId") int categoryId) {
//        System.out.println(categoryId);
        categoryService.deleteById(categoryId);
    }

    @GetMapping("/checkExist/{categoryName}")
    public boolean checkExist(@PathVariable("categoryName") String categoryName) {
        return 0 == categoryService.checkExist(categoryName);
    }

    @PutMapping("/addCategory")
    public void addCategory(@RequestBody Map map) {
        Category category = new Category((String)map.get("categoryName"),(String)map.get("categoryTime"));
//        System.out.println(category);
        categoryService.addCategory(category);
    }

    @RequestMapping("/deleteSelect")
    public void deleteSelect(@RequestBody Map map) {
        List list = (List) map.get("selectCate");
//        System.out.println(list.get(0));
        categoryService.deleteSelect(list);
    }
}
