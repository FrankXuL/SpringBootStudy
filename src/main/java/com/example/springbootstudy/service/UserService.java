package com.example.springbootstudy.service;

import com.example.springbootstudy.mapper.UserMapper;
import com.example.springbootstudy.model.User;
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
}