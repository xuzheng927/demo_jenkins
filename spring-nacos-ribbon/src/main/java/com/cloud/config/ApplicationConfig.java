package com.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @类名: ApplicationConfig
 * @描述: TODO
 * @作者: xz
 * @时间 2020/6/28 15:38
 * @修改人及修改时间：
 * @版本 1.0
 */
@Configuration
public class ApplicationConfig {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
