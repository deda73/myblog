package com.spring.blog.controller;

import com.spring.blog.entity.Article;
import com.spring.blog.entity.FirstBean;
import com.spring.blog.service.ArticleService;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/articles")
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @GetMapping("/findAll")
    public List<Article> findAll() {
        return articleService.findAll();
    }
    @PostMapping("/addArticle")
    public void addArticle(@RequestBody Map map) {
        FirstBean firstBean = new FirstBean();
        firstBean.setArticleTitle((String) map.get("articleTitle"));
        int articleCategoryId = (int) map.get("articleCategoryId");
        int articleUserId = (int) map.get("articleUserId");
        firstBean.setArticleCategoryId(articleCategoryId);
        firstBean.setArticleContent((String) map.get("articleContent"));
        firstBean.setArticleTime((String) map.get("articleTime"));
        firstBean.setArticleUserId(articleUserId);

        articleService.addArticle(firstBean);
    }

    @GetMapping("/getCount")
    public int getCount() {
        return articleService.getCount();
    }

    @GetMapping("/pageIndex/{pageIndex}/{size}")
    public List<Article> pageIndex(@PathVariable("pageIndex") int pageIndex,@PathVariable("size") int size) {
        int page = (pageIndex - 1)*size;
        return articleService.pageIndex(page,size);
    }

    @DeleteMapping("/deleteByArticleId/{articleId}")
    public void deleteByArticleId(@PathVariable("articleId") int articleId) {
        articleService.deleteByArticleId(articleId);
    }

    @PostMapping("/updateArticleById")
    public void updateArticleById(@RequestBody Map map) {
        FirstBean firstBean = new FirstBean();
        firstBean.setArticleTitle((String) map.get("articleTitle"));
        firstBean.setArticleCategoryName((String) map.get("articleCategoryName"));
        firstBean.setArticleContent((String) map.get("articleContent"));
        firstBean.setArticleTime((String) map.get("articleTime"));
        firstBean.setArticleId((int) map.get("articleId"));
        articleService.updateArticleById(firstBean);
    }

    @GetMapping("/selectArticleByUserId/{userId}")
    public List<Article> selectArticleByUserId(@PathVariable("userId") int userId) {
        return articleService.selectArticleByUserId(userId);
    }

    @GetMapping("/selectArticleByCategoryName/{categoryName}")
    public List<Article> selectArticleByCategoryName(@PathVariable("categoryName") String categoryName) {
        return articleService.selectArticleByCategoryName(categoryName);
    }
}
