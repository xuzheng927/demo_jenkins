package com.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @类名: TestController
 * @描述: TODO
 * @作者: xz
 * @时间 2020/6/5 13:58
 * @修改人及修改时间：
 * @版本 1.0
 */
@RestController
@RequestMapping("/Ribbo")
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/RibboTest1")
    public String Test1(){
        return restTemplate.getForObject("http://EUREKA-CLIENT/Test/test1",String.class);
    }

}
