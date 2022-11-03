package com.example.springbootstudy.Controller;

import com.example.springbootstudy.model.User;
import com.example.springbootstudy.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @title: UserController
 * @Author Xu
 * @Date: 2/11/2022 下午 5:10
 * @Version 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @ResponseBody
    @RequestMapping("/getuserbyid")
    public User getUserById(Integer id) {
        if (id == null) {
            return null;
        }
        return userService.getUserById(id);
    }
    @ResponseBody
    @RequestMapping("/update")
    public int update(Integer id,String username){
        if(id == null || username == null){
            return -1;
        }
        return userService.update(id,username);
    }
}