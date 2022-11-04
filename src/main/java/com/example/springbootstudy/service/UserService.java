package com.example.springbootstudy.service;

import com.example.springbootstudy.mapper.UserMapper;
import com.example.springbootstudy.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @title: UserService
 * @Author Xu
 * @Date: 29/10/2022 下午 8:18
 * @Version 1.0
 */
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    public Integer update(Integer id, String username) {
        return userMapper.update(id, username);
    }

    public Integer insert(User user) {
        return userMapper.insert(user);
    }

    public Integer delete(@Param("id") Integer id) {
        return userMapper.delete(id);
    }
    public void insert2(@Param("id") Integer id){
        userMapper.insert2(id);
    }
}