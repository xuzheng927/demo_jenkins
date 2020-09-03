package com.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @类名: EurekaClient
 * @描述: TODO
 * @作者: xz
 * @时间 2020/6/11 16:23
 * @修改人及修改时间：
 * @版本 1.0
 */
@FeignClient(value = "eureka-client",fallback = EurekaClientFallbackService.class)
public interface EurekaClientService {

    @RequestMapping("/Test/test1")
    String Test1();

    @RequestMapping("/Test/hystrixTest1")
    String HystrixTest1();
}
