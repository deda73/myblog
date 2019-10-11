package com.spring.blog.service;

import com.spring.blog.entity.Article;
import com.spring.blog.entity.FirstBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleService {
    List<Article> findAll();

    void addArticle(FirstBean firstBean);
    int getCount();
    List<Article> pageIndex(int page,int size);

    void deleteByArticleId(int articleId);
    void updateArticleById(FirstBean firstBean);
    List<Article> selectArticleByUserId(int userId);
    List<Article> selectArticleByCategoryName(String categoryName);
}
