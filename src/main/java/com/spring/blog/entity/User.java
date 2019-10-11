package com.spring.blog.entity;

public class User {
    private int userId;  //用户id
    private String userName;  // 用户名
    private String userPhone;  // 用户手机号码
    private String userNickname;  // 用户昵称
    private String userImage;  // 用户头像
    private String userPassword;  // 用户密码
    private String userEmail;  // 用户邮箱
    private String userRegistTime;  // 用户注册时间
    private int userAuthority;  // 用户权限 1管理员  2普通用户  3禁用用户


    public User(int userId, String userName, String userPhone, String userNickname, String userImage, String userPassword, String userEmail, String userRegistTime, int userAuthority) {
        this.userId = userId;
        this.userName = userName;
        this.userPhone = userPhone;
        this.userNickname = userNickname;
        this.userImage = userImage;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userRegistTime = userRegistTime;
        this.userAuthority = userAuthority;
    }


    public User(int userId, String userNickname, String userImage, int userAuthority) {
        this.userId = userId;
        this.userNickname = userNickname;
        this.userImage = userImage;
        this.userAuthority = userAuthority;
    }

    public User() {
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserRegistTime() {
        return userRegistTime;
    }

    public void setUserRegistTime(String userRegistTime) {
        this.userRegistTime = userRegistTime;
    }

    public int getUserAuthority() {
        return userAuthority;
    }

    public void setUserAuthority(int userAuthority) {
        this.userAuthority = userAuthority;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userNickname='" + userNickname + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userRegistTime='" + userRegistTime + '\'' +
                ", userAuthority=" + userAuthority +
                '}';
    }
}
