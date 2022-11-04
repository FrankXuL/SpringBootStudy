package com.example.springbootstudy.mapper;

import com.example.springbootstudy.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @title: UserMapper
 * @Author Xu
 * @Date: 2/11/2022 下午 4:58
 * @Version 1.0
 */
@Mapper
public interface UserMapper {
    //根据用户id查询
    User getUserById(@Param("id") Integer id);

    Integer update(@Param("id") Integer id, @Param("username") String username);

    Integer insert(User user);

    Integer delete(@Param("id") Integer id);

    void insert2(@Param("id") Integer id);
}