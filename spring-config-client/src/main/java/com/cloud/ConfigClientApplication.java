package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @类名: ConfigClientApplication
 * @描述: TODO
 * @作者: xz
 * @时间 2020/6/24 15:15
 * @修改人及修改时间：
 * @版本 1.0
 */

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class,args);
    }
}
