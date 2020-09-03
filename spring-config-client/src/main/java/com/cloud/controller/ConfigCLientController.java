package com.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @类名: ConfigCLientController
 * @描述: TODO
 * @作者: xz
 * @时间 2020/6/24 15:16
 * @修改人及修改时间：
 * @版本 1.0
 */
@RestController
@RequestMapping("config")
@RefreshScope
public class ConfigCLientController {

    @Value("${config.info}")
    private String configInfo;

    @RequestMapping("getConfigInfo")
    public String getConfigInfo(){
        return configInfo;
    }
}
