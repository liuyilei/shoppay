package com.fourkmiles.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @description: Redis服务
 * @author: liuyilei
 * @create: 2019-10-21 15:54
 **/
@SuppressWarnings({ "rawtypes", "unchecked" })
@Component
public class RedisService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void setString(String key, Object data, Long timeout) {
        if (data instanceof String) stringRedisTemplate.opsForValue().set(key, (String) data);
        if (timeout != null) stringRedisTemplate.expire(key, timeout, TimeUnit.SECONDS);
    }

    public Object getString(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    public void delKey(String key) {
        stringRedisTemplate.delete(key);
    }
}
