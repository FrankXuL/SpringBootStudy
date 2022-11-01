package com.example.springbootstudy.Controller;

import com.example.springbootstudy.model.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @title: UserController
 * @Author Xu
 * @Date: 28/10/2022 下午 3:35
 * @Version 1.0
 */
@Controller
@ResponseBody  //返回一个非静态页面的数据
@Slf4j(topic = "error")  //lombok创建logger类
@RequestMapping("/user")
@SuppressWarnings({"all"})
public class UserController {
    //使用日志类打印日志
    //private static final Logger log = LoggerFactory.getLogger(UserController.class);
    @RequestMapping("/hello")  //路由地址
    public String hello() {
        return "Hello,SpringBoot";
    }

    @RequestMapping("/log")
    public void TestLog() {
        log.trace("trace111");
        log.debug("debug111");
        log.info("info111");
        log.warn("warn111");
        log.error("error111");
    }

    @RequestMapping("/getuserbyid")
    public UserInfo getUserById(Integer id) {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(id == null ? 0 : id);
        userInfo.setUsername("111");
        userInfo.setAge(18);
        return userInfo;
    }
}