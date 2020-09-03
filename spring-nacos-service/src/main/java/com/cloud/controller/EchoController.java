package com.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

/**
 * @类名: EchoController
 * @描述: TODO
 * @作者: xz
 * @时间 2020/6/28 14:57
 * @修改人及修改时间：
 * @版本 1.0
 */
@RestController
@RefreshScope
public class EchoController {

    private static final  Logger logger = LoggerFactory.getLogger(EchoController.class);

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }

    @RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
    public String echo(@PathVariable String string) {
        logger.info("-----------------------------------,{}",string);
        return "Hello Nacos Discovery " + string;
    }


}
