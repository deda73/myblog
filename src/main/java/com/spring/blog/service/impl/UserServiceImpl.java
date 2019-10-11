package com.spring.blog.service.impl;

import com.spring.blog.entity.User;
import com.spring.blog.mapper.UserMapper;
import com.spring.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public int findByNameAndPassword(User user)  {
        return userMapper.findByNameAndPassword(user);
    }

    @Override
    public int findByPhoneAndPassword(User user) {
        return userMapper.findByPhoneAndPassword(user);
    }

    @Override
    public int findByEmailAndPassword(User user) {
        return userMapper.findByEmailAndPassword(user);
    }

    @Override
    public int checkUserNameExist(User user) {
        return userMapper.checkUserNameExist(user);
    }

    @Override
    public int checkUserPhoneExist(User user) {
        return userMapper.checkUserPhoneExist(user);
    }

    @Override
    public int checkUserEmailExist(User user) {
        return userMapper.checkUserEmailExist(user);
    }

    @Override
    public void regist(User user) {
        userMapper.regist(user);
    }

    @Override
    public User findByIdentity(String identity) {
        return userMapper.findByIdentity(identity);
    }

    @Override
    public void deleteById(int userId) {
        userMapper.deleteById(userId);
    }

    @Override
    public void updateAuthority1(int userId) {
        userMapper.updateAuthority1(userId);
    }

    @Override
    public void updateAuthority2(int userId) {
        userMapper.updateAuthority2(userId);
    }
}
