package com.cloud.hystrix.controller;

import com.cloud.hystrix.service.UserHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @类名: UserHystrixController
 * @描述: TODO
 * @作者: xz
 * @时间 2020/6/5 16:30
 * @修改人及修改时间：
 * @版本 1.0
 */
@RestController
@RequestMapping("/Hystrix")
public class UserHystrixController {

    private static final Logger logger = LoggerFactory.getLogger(UserHystrixController.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserHystrixService userHystrixService;

    @HystrixCommand(fallbackMethod = "getDefaultUser",commandProperties = {
            // 确定断路器是否用于跟踪运行状况和短路请求（如果跳闸）。默认值为true
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
            // 熔断触发的最小个数/10s，默认值：20
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
            // 熔断多少毫秒后去尝试请求，默认值：5000
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),
            // 失败率达到多少百分比后熔断，默认值：50，主要根据依赖重要性进行调整
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60")
    })
    @GetMapping("/HystrixTest1/{a}")
    public String hystrixTest1(@PathVariable int a){
        return userHystrixService.hystrixTest1(a);
    }

    public String getDefaultUser( int a){
        return "服务降级22222222";
    }

    @GetMapping("/HystrixTest2/{a}")
    public String hystrixTest2(@PathVariable int a){
        return userHystrixService.hystrixTest2(a);
    }

    @GetMapping("/HystrixTest3/{id}")
    @HystrixCommand(fallbackMethod = "getDefaultUser",ignoreExceptions = {NullPointerException.class})
    public String hystrixTest3(@PathVariable Long id){
        if(id == 1){
            throw new IndexOutOfBoundsException();
        }else if(id ==2){
            throw new NullPointerException();
        }
        return id+"";
    }

    @GetMapping("/HystrixTest4/{id}")
    public String hystrixTest4_Cache(@PathVariable Long id) {
//        HystrixRequestContext.initializeContext();
        userHystrixService.getUserCache(id);
        userHystrixService.getUserCache(id);
        userHystrixService.getUserCache(id);
        return id + "";
    }

    public String getDefaultUser(Long id){
        return "异常等于NullPointerException";
    }

    @GetMapping("/HystrixTest5/{id}")
    public String hystrixTest5_removeCache(@PathVariable Long id) {
//        HystrixRequestContext.initializeContext();
        userHystrixService.getUserCache(id);
        userHystrixService.removeCache(id);
        userHystrixService.getUserCache(id);
        return id + "";
    }

    @GetMapping("/HystrixTest6/{id}")
    public String hystrixTest6_Collapser(@PathVariable Long id) throws InterruptedException {
        userHystrixService.getUserFuture(1L);
        userHystrixService.getUserFuture(2L);
        Thread.sleep(200);
        userHystrixService.getUserFuture(3L);
        return id + "";
    }


    @GetMapping("/HystrixTest7")
    @HystrixCommand(fallbackMethod = "getDefaultUser")
    public String hystrixTest7_Collapser(int a) throws InterruptedException {
        return userHystrixService.hystrixTest1(a);
    }

    @GetMapping("/HystrixTest8")
    public String hystrixTest8_Collapser(int a) throws InterruptedException {
        return userHystrixService.hystrixTest1(a);
    }
}
