package com.spring.blog.service.impl;

import com.spring.blog.entity.Article;
import com.spring.blog.entity.FirstBean;
import com.spring.blog.mapper.ArticleMapper;
import com.spring.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleMapper articleMapper;

    @Override
    public List<Article> findAll() {
        return articleMapper.findAll();
    }

    @Override
    public void addArticle(FirstBean firstBean) {
        articleMapper.addArticle(firstBean);
    }

    @Override
    public int getCount() {
        return articleMapper.getCount();
    }

    @Override
    public List<Article> pageIndex(int page, int size) {
        return articleMapper.pageIndex(page, size);
    }

    @Override
    public void deleteByArticleId(int articleId) {
        articleMapper.deleteByArticleId(articleId);
    }

    @Override
    public void updateArticleById(FirstBean firstBean) {
        articleMapper.updateArticleById(firstBean);
    }

    @Override
    public List<Article> selectArticleByUserId(int userId) {
        return articleMapper.selectArticleByUserId(userId);
    }

    @Override
    public List<Article> selectArticleByCategoryName(String categoryName) {
        return articleMapper.selectArticleByCategoryName(categoryName);
    }
}
