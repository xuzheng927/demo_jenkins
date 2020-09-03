package com.cloud.hystrix.service;

import com.cloud.hystrix.bean.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheRemove;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheResult;
import com.netflix.hystrix.contrib.javanica.command.AsyncResult;
import org.apache.commons.lang.math.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/**
 * @类名: UserHystrixService
 * @描述: TODO
 * @作者: xz
 * @时间 2020/6/8 16:17
 * @修改人及修改时间：
 * @版本 1.0
 */
@Service
public class UserHystrixService {

    private static final Logger logger = LoggerFactory.getLogger(UserHystrixService.class);

//    @HystrixCommand(fallbackMethod = "getDefaultUser",commandProperties = {
//            // 确定断路器是否用于跟踪运行状况和短路请求（如果跳闸）。默认值为true
//            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
//            // 熔断触发的最小个数/10s，默认值：20
//            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
//            // 熔断多少毫秒后去尝试请求，默认值：5000
//            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),
//            // 失败率达到多少百分比后熔断，默认值：50，主要根据依赖重要性进行调整
//            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60")
//    })
    public String hystrixTest1(int a){
        a = 1/a;
        logger.info("--------------a:{}",a);
        return a+"";
    }
    public String getDefaultUser(int a){
        return "服务降级22222222";
    }


    @HystrixCommand(fallbackMethod = "Test2",
            commandKey = "Test3",
            groupKey = "Test4",
            threadPoolKey = "Test5")
    @GetMapping("/HystrixTest2")
    public String hystrixTest2(int a){
        a = 1/a;
        logger.info("--------------a:{}",a);
        return a+"";
//        return restTemplate.getForObject("http://EUREKA-CLIENT/Test/hystrixTest1",String.class);
    }

    public String Test2(int a){
        return "fallbackMethod：降级处理方法!!!!";
    }
    public String Test3(int a){
        return "commandKey：命令名称，用于区分不同的命令!!!!";
    }
    public String Test4(int a){
        return "groupKey：分组名称，Hystrix会根据不同的分组来统计命令的告警及仪表盘信息；!!!!";
    }
    public String Test5(int a){
        return "threadPoolKey：线程池名称，用于划分线程池!!!!";
    }


    @CacheResult(cacheKeyMethod = "getCacheKey")
    @HystrixCommand(fallbackMethod = "getDefaultUser",commandKey = "getUserCache")
    public String getUserCache(Long id){
        logger.info("getUserCache id:{}",id);
        return id+"";
    }
    /**
     * 为缓存生成key的方法
     */
    public String getCacheKey(Long id) {
        return String.valueOf(id);
    }
    public String getDefaultUser(Long id){
        return "异常等于NullPointerException";
    }


    @CacheRemove(commandKey = "getUserCache", cacheKeyMethod = "getCacheKey")
    @HystrixCommand
    public String removeCache(Long id) {
        logger.info("removeCache id:{}", id);
        return id+"";
    }




    @HystrixCollapser(batchMethod = "getUserByIds",collapserProperties = {
            @HystrixProperty(name = "timerDelayInMilliseconds", value = "100")
    })
    public Future<User> getUserFuture(Long id) {
        return new AsyncResult<User>(){

            @Override
            public User invoke() {
                String a = RandomUtils.nextInt(10)+"";
                User user = new User();
                user.setName("11");
                user.setAge(a);
                logger.info("getUserFuture:{}",a);
                return user;
            }
        };
    }

    @HystrixCommand
    public List<User> getUserByIds(List<Long> ids) {
        logger.info("getUserByIds:{}", ids);
        List<User> list = new ArrayList<User>();
        User user = new User();
        user.setName("11");
        String a = RandomUtils.nextInt(10)+"";
        user.setAge(a);
        list.add(user);
        return list;
    }
}
