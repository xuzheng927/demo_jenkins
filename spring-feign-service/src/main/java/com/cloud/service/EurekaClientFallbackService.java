package com.cloud.service;

import org.springframework.stereotype.Component;

/**
 * @类名: EurekaClientFallbackService
 * @描述: TODO
 * @作者: xz
 * @时间 2020/6/11 16:45
 * @修改人及修改时间：
 * @版本 1.0
 */
@Component
public class EurekaClientFallbackService implements EurekaClientService{

    public String Test1() {
        return "服务降级测试";
    }

    public String HystrixTest1() {
        return "服务降级测试！！！！！！！！！！！！！！！";
    }
}
