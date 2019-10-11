package com.spring.blog.entity;

public class Category {
    private int categoryId;  // 类别id
    private String categoryName;    // 类别名称
    private String categoryTime;  // 类别启用时间

    public Category() {
    }

    public Category(int categoryId, String categoryName, String categoryTime) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryTime = categoryTime;
    }

    public Category(String categoryName, String categoryTime) {
        this.categoryName = categoryName;
        this.categoryTime = categoryTime;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryTime() {
        return categoryTime;
    }

    public void setCategoryTime(String categoryTime) {
        this.categoryTime = categoryTime;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryTime='" + categoryTime + '\'' +
                '}';
    }
}
