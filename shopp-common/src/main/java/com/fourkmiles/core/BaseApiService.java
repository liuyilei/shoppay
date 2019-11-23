package com.fourkmiles.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description: 基础API服务接口
 * @author: liuyilei
 * @create: 2019-10-21 15:41
 **/
@Component
public class BaseApiService {

    @Autowired
    private RedisService redisService;

    public ApiResult result(int flag, String message, Object data) {
        return new ApiResult(flag, message, data);
    }

    public ApiResult success() {
        return new ApiResult(0, null, null);
    }

    public ApiResult success(Object data) {
        return new ApiResult(0, null, data);
    }

    public ApiResult success(Object data, String message) {
        return new ApiResult(0, message, data);
    }

    public ApiResult failed() {
        return new ApiResult(-1, null, null);
    }

    public ApiResult failed(int flag) {
        return new ApiResult(flag, null, null);
    }

    public ApiResult failed(int flag, String message) {
        return new ApiResult(flag, message, null);
    }

    public void set(String key, Object data, Long timeout) {
        redisService.setString(key, data, timeout);
    }

    public ApiResult get(String key) {
        return success(redisService.getString(key));
    }
}
