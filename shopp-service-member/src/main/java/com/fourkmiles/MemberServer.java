package com.fourkmiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description: 会员接口服务启动类
 * @author: liuyilei
 * @create: 2019-10-21 10:18
 **/
@SpringBootApplication
@EnableEurekaClient
public class MemberServer {
    public static void main(String[] args) {
        SpringApplication.run(MemberServer.class, args);
    }
}
