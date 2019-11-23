package com.fourkmiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description: EureKaServer启动类
 * @author: liuyilei
 * @create: 2019-10-21 10:18
 **/
@SpringBootApplication
@EnableEurekaServer
public class EureKaServer {
    public static void main(String[] args) {
        SpringApplication.run(EureKaServer.class, args);
    }
}
