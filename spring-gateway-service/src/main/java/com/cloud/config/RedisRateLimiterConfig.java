//package com.cloud.config;
//
//import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import reactor.core.publisher.Mono;
//
///**
// * @类名: RedisRateLimiterConfig
// * @描述: TODO
// * @作者: xz
// * @时间 2020/6/22 19:28
// * @修改人及修改时间：
// * @版本 1.0
// */
//@Configuration
//public class RedisRateLimiterConfig {
//
//
//    @Bean
//    public KeyResolver userKeyResolver(){
//        return exchange -> Mono.just(exchange.getRequest().getQueryParams().getFirst("username"));
//    }
//
//    @Bean
//    public KeyResolver ipKeyResolver() {
//        return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getHostName());
//    }
//}
