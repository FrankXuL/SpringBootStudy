package com.example.springbootstudy.model;

import lombok.Data;

/**
 * @title: UserInfo
 * @Author Xu
 * @Date: 30/10/2022 上午 11:23
 * @Version 1.0
 */
@Data
public class UserInfo {
    private int id;
    private String username;
    private String password;
    private int age;
}