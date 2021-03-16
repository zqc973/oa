package com.zqc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @PackageName:com.zqc
 * @ClassName:UsersApplication
 * @Description:
 * @Author: zqc
 * @date 2021/3/11 14:22
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class UsersApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsersApplication.class, args);
    }
}
