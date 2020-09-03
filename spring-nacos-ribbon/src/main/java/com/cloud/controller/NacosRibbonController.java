package com.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @类名: NacosRibbonController
 * @描述: TODO
 * @作者: xz
 * @时间 2020/6/28 15:37
 * @修改人及修改时间：
 * @版本 1.0
 */
@RestController
public class NacosRibbonController {

    private static  final Logger logger = LoggerFactory.getLogger(NacosRibbonController.class);

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
    public String echo(@PathVariable String str) {
        logger.info("1231231231312232131321311321");
        return restTemplate.getForObject("http://nacos-service/echo/" + str, String.class);
    }
}
