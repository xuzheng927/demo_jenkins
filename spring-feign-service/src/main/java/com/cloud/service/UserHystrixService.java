package com.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @类名: UserHystrixService
 * @描述: TODO
 * @作者: xz
 * @时间 2020/6/15 15:16
 * @修改人及修改时间：
 * @版本 1.0
 */

@FeignClient(value = "hystrix-service",fallback = UserHystrixFallBackService.class)
public interface UserHystrixService {

    @RequestMapping("/Hystrix/HystrixTest1/{a}")
    String HystrixTest1(@RequestParam("a") int a);

    @RequestMapping("/Hystrix/HystrixTest2/{a}")
    String HystrixTest2(@RequestParam("a") int a);
}
