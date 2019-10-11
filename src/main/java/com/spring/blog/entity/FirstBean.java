package com.spring.blog.entity;

public class FirstBean {
    private int articleId;
    private String articleTitle;
    private String articleTime;
    private String articleContent;
    private int articleUserId;
    private int articleCategoryId;
    private String articleCategoryName;

    public FirstBean() {
    }

    public FirstBean(int articleId, String articleTitle, String articleTime, String articleContent, String articleCategoryName) {
        this.articleId = articleId;
        this.articleTitle = articleTitle;
        this.articleTime = articleTime;
        this.articleContent = articleContent;
        this.articleCategoryName = articleCategoryName;
    }

    public FirstBean(int articleId, String articleTitle, String articleTime, String articleContent, int articleUserId, int articleCategoryId, String articleCategoryName) {
        this.articleId = articleId;
        this.articleTitle = articleTitle;
        this.articleTime = articleTime;
        this.articleContent = articleContent;
        this.articleUserId = articleUserId;
        this.articleCategoryId = articleCategoryId;
        this.articleCategoryName = articleCategoryName;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    @Override
    public String toString() {
        return "FirstBean{" +
                "articleTitle='" + articleTitle + '\'' +
                ", articleTime='" + articleTime + '\'' +
                ", articleContent='" + articleContent + '\'' +
                ", articleUserId=" + articleUserId +
                ", articleCategoryId=" + articleCategoryId +
                '}';
    }


    public String getArticleCategoryName() {
        return articleCategoryName;
    }

    public void setArticleCategoryName(String articleCategoryName) {
        this.articleCategoryName = articleCategoryName;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleTime() {
        return articleTime;
    }

    public void setArticleTime(String articleTime) {
        this.articleTime = articleTime;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public int getArticleUserId() {
        return articleUserId;
    }

    public void setArticleUserId(int articleUserId) {
        this.articleUserId = articleUserId;
    }

    public int getArticleCategoryId() {
        return articleCategoryId;
    }

    public void setArticleCategoryId(int articleCategoryId) {
        this.articleCategoryId = articleCategoryId;
    }
}
