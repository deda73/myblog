package com.spring.blog.mapper;

import com.spring.blog.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CategoryMapper {

    List<Category> findAll();
    void deleteById(int categoryId);
    void addCategory(Category category);
    int checkExist(String categoryName);
    void deleteSelect(List list);
}
