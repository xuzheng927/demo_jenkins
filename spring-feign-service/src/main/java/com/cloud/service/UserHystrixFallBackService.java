package com.cloud.service;

import org.springframework.stereotype.Component;

/**
 * @类名: UserHystrixFallBackService
 * @描述: TODO
 * @作者: xz
 * @时间 2020/6/15 15:17
 * @修改人及修改时间：
 * @版本 1.0
 */
@Component
public class UserHystrixFallBackService implements UserHystrixService{
    public String HystrixTest1(int a) {
        return "服务降级测试111111111";
    }

    public String HystrixTest2(int a) {
        return "服务降级测试!!!!!!!!!!!!!!!";
    }
}
