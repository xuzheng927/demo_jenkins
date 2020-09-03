package com.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @类名: FallBackController
 * @描述: TODO
 * @作者: xz
 * @时间 2020/6/21 22:01
 * @修改人及修改时间：
 * @版本 1.0
 */
@RestController
public class FallBackController {
    @GetMapping("/fallback")
    public Object fallback() {
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("data",null);
        result.put("message","Get request fallback!");
        result.put("code",500);
        return result;
    }
}
