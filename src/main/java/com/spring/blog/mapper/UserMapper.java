package com.spring.blog.mapper;

import com.spring.blog.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {
    List<User> findAll() ;
    int findByNameAndPassword(User user);
    int findByPhoneAndPassword(User user);
    int findByEmailAndPassword(User user);
    int checkUserNameExist(User user);
    int checkUserPhoneExist(User user);
    int checkUserEmailExist(User user);
    void regist(User user);
    User findByIdentity(String identity);
    void deleteById(int userId);
    void updateAuthority1(int userId);
    void updateAuthority2(int userId);
}
