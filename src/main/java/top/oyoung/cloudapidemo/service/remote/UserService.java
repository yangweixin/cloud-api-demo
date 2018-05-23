package top.oyoung.cloudapidemo.service.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import top.oyoung.cloudapidemo.entity.remote.UserEntity;
import top.oyoung.cloudapidemo.service.fallback.UserFallback;

/**
 * @Author: Yang Weixin
 * @Description:
 * @DateTime: 2018/5/23 上午11:37
 */
@FeignClient(name = "cloud-service-demo", fallbackFactory = UserFallback.class)
public interface UserService {

    @GetMapping("/user/id")
    String sayHi(
        @RequestParam("id") Long id
    );

    @GetMapping("/user/area")
    String sayHi1(
        @RequestParam("id") Long id,
        @RequestHeader("area") String area
    );

    @PostMapping("/user/entity")
    String sayHi2(
        @RequestBody UserEntity user
    );
}
