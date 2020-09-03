package com.cloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @类名: FeignConfig
 * @描述: TODO
 * @作者: xz
 * @时间 2020/6/12 10:21
 * @修改人及修改时间：
 * @版本 1.0
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
