package com.example.springbootstudy.model;

import lombok.Data;
import java.util.Date;

/**
 * @title: User
 * @Author Xu
 * @Date: 2/11/2022 下午 4:53
 * @Version 1.0
 */

@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String photo;
    private Date createTime;
    private Date updateTime;
}