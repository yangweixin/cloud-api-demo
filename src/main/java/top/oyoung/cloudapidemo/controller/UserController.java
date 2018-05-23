package top.oyoung.cloudapidemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.oyoung.cloudapidemo.entity.remote.UserEntity;
import top.oyoung.cloudapidemo.service.remote.UserService;

import javax.annotation.Resource;

@RequestMapping("/user")
@RestController
public class UserController {

    @Resource
    private UserService userService;

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
}
