package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @类名: HystrixBashboardApplication
 * @描述: TODO
 * @作者: xz
 * @时间 2020/6/10 17:01
 * @修改人及修改时间：
 * @版本 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrixDashboard
public class HystrixBashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixBashboardApplication.class,args);
    }
}
