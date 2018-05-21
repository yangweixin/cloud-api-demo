package top.oyoung.cloudapidemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RequestMapping("/user")
@RestController
public class UserController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("")
    public String getUserMessage(){
        return restTemplate.getForEntity("http://CLOUD-SERVICE-DEMO/user", String.class).getBody();
    }
}
