package com.cloud.hystrix.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @类名: ApplicationContextConfig
 * @描述: TODO
 * @作者: xz
 * @时间 2020/6/5 16:38
 * @修改人及修改时间：
 * @版本 1.0
 */
@Configuration
public class ApplicationContextConfig{

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(10000);//超时时长
        requestFactory.setReadTimeout(10000);//超时时长
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        return restTemplate;
    }
}
