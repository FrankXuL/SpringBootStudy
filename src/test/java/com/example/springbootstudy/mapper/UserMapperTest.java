package com.example.springbootstudy.mapper;

import com.example.springbootstudy.model.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@SpringBootTest
@Slf4j
class UserMapperTest {

    @Resource
    private UserMapper userMapper;
    @Test
    void getUserById() {
        User user = userMapper.getUserById(2);

        log.info("用户信息"+user);
    }

    @Transactional
    @Test
    void update() {
        int result = userMapper.update(1, "test");
        log.info(String.valueOf(result));
    }

    @Transactional
    @Test
    void insert() {
        User user = new User();
        user.setUsername("test");
        user.setPassword("111");
        user.setPhoto("test.png");
        int result = userMapper.insert(user);
        log.info(String.valueOf(result));
    }

    @Transactional
    @Test
    void delete() {
        int result = userMapper.delete(1);
        log.info(String.valueOf(result));
    }

    @Test
    void insert2() {
        User user = new User();
        user.setUsername("test");
        user.setPassword("111");
        user.setPhoto("test.png");
        log.info("" +userMapper.insert(user));
    }
}