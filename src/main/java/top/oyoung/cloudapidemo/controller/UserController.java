package top.oyoung.cloudapidemo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.oyoung.cloudapidemo.entity.remote.UserEntity;
import top.oyoung.cloudapidemo.service.remote.UserService;

import javax.annotation.Resource;

@RefreshScope
@RequestMapping("/user")
@RestController
public class UserController {

    @Resource
    private UserService userService;
    @Value("${mark}")
    private String mark;

    @GetMapping("id")
    public String getUserMessage(){
        return userService.sayHi(1L);
    }

    @GetMapping("area")
    public String getUserMessage1(){
        return userService.sayHi1(1L, "shenzhen");
    }

    @GetMapping("entity")
    public String getUserMessage2(){
        UserEntity user = new UserEntity("young", "male");
        return userService.sayHi2(user);
    }

    @GetMapping("hello")
    public String hello(){
        return "mark: "+ mark ;
    }
}
