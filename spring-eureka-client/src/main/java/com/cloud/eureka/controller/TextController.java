package com.cloud.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @类名: TextController
 * @描述: TODO
 * @作者: xz
 * @时间 2020/6/5 13:49
 * @修改人及修改时间：
 * @版本 1.0
 */
@RestController
@RequestMapping("/Test")
public class TextController {

    @GetMapping("/test1")
    public String Test1(){
        System.out.println("-------------------------------");
        return "Hello Word!!!";
    }

    @GetMapping("/hystrixTest1")
    public String HystrixTest1(){
        return "服务降级！！！";
    }
}
