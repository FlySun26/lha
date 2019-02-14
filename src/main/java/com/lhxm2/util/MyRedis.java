package com.lhxm2.util;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MyRedis {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    public void set(String obj,Object attr,Object value){
        HashOperations<String, Object, Object> hashOperations = stringRedisTemplate.opsForHash();
        hashOperations.put(obj,attr, JSON.toJSONString(value));
    }
    public List getAll(String obj,Object attr){
        HashOperations<String, Object, Object> hashOperations = stringRedisTemplate.opsForHash();
        String s = (String) hashOperations.get(obj, attr);
        return new ArrayList();
    }
}
