package com.cloud.hystrix.bean;

import com.alibaba.fastjson.JSON;

/**
 * @类名: Text
 * @描述: TODO
 * @作者: xz
 * @时间 2020/6/22 18:15
 * @修改人及修改时间：
 * @版本 1.0
 */

public class Text {
    public static void main(String[] args) {
        String json="{\"hits\":{\"hits\":[{\"_source\":{\"lab339\":30.0,\"lab268\":\"0\",\"lab466\":\"0\",\"lab499\":\"2-2A8C1KBS\",\"lab498\":\"一个月\",\"lab497\":\"0\",\"lab464\":\"0\",\"lab463\":\"2019-02-01 00:00:00\",\"lab496\":\"\",\"lab474\":0.44,\"lab374\":\"-1\",\"lab14\":\"201802-翼企享福30元畅享套餐\",\"lab13\":\"2-2A8C1KBS\",\"lab1\":\"19901670172\"}}],\"total\":1},\"timed_out\":false}";
        System.out.println(json);
        JsonData jsonData = JSON.parseObject(json, JsonData.class);
        System.out.println(jsonData.toString());
    }
}
