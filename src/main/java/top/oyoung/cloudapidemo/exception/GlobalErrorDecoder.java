package top.oyoung.cloudapidemo.exception;

import com.netflix.hystrix.exception.HystrixBadRequestException;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.stereotype.Component;

/**
 * @Author: Yang Weixin
 * @Description:
 * @DateTime: 2018/5/23 下午3:12
 */
@Component
public class GlobalErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String s, Response response) {
        return new HystrixBadRequestException(s);
    }
}
