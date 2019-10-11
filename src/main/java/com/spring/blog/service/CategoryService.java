package com.spring.blog.service;

import com.spring.blog.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    void deleteById(int categoryId);
    void addCategory(Category category);
    int checkExist(String categoryName);

    void deleteSelect(List list);
}
