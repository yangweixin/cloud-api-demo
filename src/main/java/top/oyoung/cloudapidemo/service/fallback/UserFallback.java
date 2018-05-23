package top.oyoung.cloudapidemo.service.fallback;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import top.oyoung.cloudapidemo.entity.remote.UserEntity;
import top.oyoung.cloudapidemo.service.remote.UserService;

/**
 * @Author: Yang Weixin
 * @Description:
 * @DateTime: 2018/5/23 下午2:41
 */
@Component
public class UserFallback implements FallbackFactory<UserService> {

    @Override
    public UserService create(Throwable cause) {
        return new UserService() {
            @Override
            public String sayHi(Long id) {
                return "ERROR: /user/id \\n"+ cause.getMessage();
            }

            @Override
            public String sayHi1(Long id, String area) {
                return "ERROR: /user/area \\n"+ cause.getMessage();
            }

            @Override
            public String sayHi2(UserEntity user) {
                return "ERROR: /user/entity \\n"+ cause.getMessage();
            }
        };
    }
}
