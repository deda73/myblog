package com.spring.blog.entity;

public class Article {
    private int articleId;  // 文章id
    private String articleTitle;  // 文章标题
    private String articleTime;  // 文章最后编辑时间
    private String articleUserName; // 文章作者名
    private String articleCategoryName;  // 文章类别名
    private String articleContent;  // 文章内容

    public Article() {
    }

    public Article(int articleId, String articleTitle, String articleTime, String articleUserName, String articleCategoryName) {
        this.articleId = articleId;
        this.articleTitle = articleTitle;
        this.articleTime = articleTime;
        this.articleUserName = articleUserName;
        this.articleCategoryName = articleCategoryName;
    }

    public Article(int articleId, String articleTitle, String articleTime, String articleUserName, String articleCategoryName, String articleContent) {
        this.articleId = articleId;
        this.articleTitle = articleTitle;
        this.articleTime = articleTime;
        this.articleUserName = articleUserName;
        this.articleCategoryName = articleCategoryName;
        this.articleContent = articleContent;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
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

    public String getArticleUserName() {
        return articleUserName;
    }

    public void setArticleUserName(String articleUserName) {
        this.articleUserName = articleUserName;
    }

    public String getArticleCategoryName() {
        return articleCategoryName;
    }

    public void setArticleCategoryName(String articleCategoryName) {
        this.articleCategoryName = articleCategoryName;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleId=" + articleId +
                ", articleTitle='" + articleTitle + '\'' +
                ", articleTime='" + articleTime + '\'' +
                ", articleUserName='" + articleUserName + '\'' +
                ", articleCategoryName='" + articleCategoryName + '\'' +
                ", articleContent='" + articleContent + '\'' +
                '}';
    }
}
