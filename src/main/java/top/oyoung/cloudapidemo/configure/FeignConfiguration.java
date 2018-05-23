package top.oyoung.cloudapidemo.configure;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Yang Weixin
 * @Description:
 * @DateTime: 2018/5/23 下午6:30
 */
@Configuration
public class FeignConfiguration {

    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
