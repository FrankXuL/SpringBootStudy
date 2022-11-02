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
    public User getUserById(@Param("id") Integer id);

}