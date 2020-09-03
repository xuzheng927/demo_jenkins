package com.cloud.controller;

import com.cloud.service.EurekaClientService;
import com.cloud.service.UserHystrixService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @类名: EurekaClientController
 * @描述: TODO
 * @作者: xz
 * @时间 2020/6/11 16:28
 * @修改人及修改时间：
 * @版本 1.0
 */
@RestController
@RequestMapping("/feign")
public class EurekaClientController {

    private static final Logger logger = LoggerFactory.getLogger(EurekaClientController.class);

    @Autowired
    private EurekaClientService eurekaClientService;

    @Autowired
    private UserHystrixService userHystrixService;

    @RequestMapping("/feign1/{a}")
    public String Feign_Test1(@PathVariable int  a){
        logger.info("a={}",a);
        return userHystrixService.HystrixTest1(a);
    }
    @RequestMapping("/feign2/{a}")
    public String Feign_Test2(@PathVariable int  a){
        return userHystrixService.HystrixTest2(a);
    }

    @RequestMapping("/feign3")
    public String Feign_Test3(){
        return eurekaClientService.Test1();
    }
}
