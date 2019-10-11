package com.spring.blog.service.impl;

import com.spring.blog.entity.Category;
import com.spring.blog.mapper.CategoryMapper;
import com.spring.blog.mapper.UserMapper;
import com.spring.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;
    @Override
    public List<Category> findAll() {
        return categoryMapper.findAll();
    }

    @Override
    public void deleteById(int categoryId) {
        categoryMapper.deleteById(categoryId);
    }

    @Override
    public void addCategory(Category category) {
        categoryMapper.addCategory(category);
    }

    @Override
    public int checkExist(String categoryName) {
        return categoryMapper.checkExist(categoryName);
    }

    @Override
    public void deleteSelect(List list) {
        categoryMapper.deleteSelect(list);
    }
}
