package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @类名: Application
 * @描述: TODO
 * @作者: xz
 * @时间 2020/6/4 17:19
 * @修改人及修改时间：
 * @版本 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate(){
//        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
//        requestFactory.setConnectTimeout(10000);//超时时长
//        requestFactory.setReadTimeout(10000);//超时时长
//        RestTemplate restTemplate = new RestTemplate(requestFactory);
//        return restTemplate;
//    }
}
