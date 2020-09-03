package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @类名: FeignServiceApplication
 * @描述: TODO
 * @作者: xz
 * @时间 2020/6/11 16:16
 * @修改人及修改时间：
 * @版本 1.0
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignServiceApplication.class,args);
    }
}
