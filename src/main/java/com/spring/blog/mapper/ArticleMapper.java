package com.spring.blog.mapper;

import com.spring.blog.entity.Article;
import com.spring.blog.entity.FirstBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ArticleMapper {

    List<Article> findAll();
    void addArticle(FirstBean firstBean);
    int getCount();
    List<Article> pageIndex(@Param(value = "page") int page,@Param(value = "size") int size);
    void deleteByArticleId(int articleId);
    void updateArticleById(FirstBean firstBean);
    List<Article> selectArticleByUserId(int userId);
    List<Article> selectArticleByCategoryName(String categoryName);

}
