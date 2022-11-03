package com.example.springbootstudy.mapper;

import com.example.springbootstudy.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    void getUserById() {
        User user = userMapper.getUserById(1);
        Assertions.assertNotNull(user);
        System.out.println(user);
    }
}