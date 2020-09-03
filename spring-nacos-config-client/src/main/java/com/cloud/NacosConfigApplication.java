package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @类名: NacosConfigApplication
 * @描述: TODO
 * @作者: xz
 * @时间 2020/6/28 17:55
 * @修改人及修改时间：
 * @版本 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigApplication.class,args);
    }
}
