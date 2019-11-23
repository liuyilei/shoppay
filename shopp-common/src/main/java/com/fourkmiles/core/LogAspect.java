package com.fourkmiles.core;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @description: 切面日志打印
 * @author: liuyilei
 * @create: 2019-10-24 09:49
 **/
@Aspect
@Component
@Slf4j
public class LogAspect {

    @Pointcut("execution(public * com.fourkmiles.api.service.*.*(..))")
    private void requestAspect() {}

    @Before(value = "requestAspect()")
    public void methodBefore(JoinPoint point) {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        try {
            log.info("==================请求地址及方式==================");
            log.info(request.getRequestURL().toString() + " " + request.getMethod());
            log.info("==================请求类方法==================");
            log.info(point.getSignature().toString());
            log.info("==================请求类方法参数列表==================");
            log.info(JSON.toJSONString(point.getArgs()));
        } catch (Exception e) {
            log.error("###LogAspect.class methodBefore() ### ERROR:", e);
        }
    }

    @AfterReturning(returning = "res", pointcut = "requestAspect()")
    public void methodAfterReturing(Object res) {
        try {
            log.info("==================返回内容==================");
            log.info(JSON.toJSONString(res));
        } catch (Exception e) {
            log.error("###LogAspect.class methodAfterReturing() ### ERROR:", e);
        }
    }
}
