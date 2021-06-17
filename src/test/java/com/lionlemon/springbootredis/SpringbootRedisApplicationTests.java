package com.lionlemon.springbootredis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class SpringbootRedisApplicationTests {
    @Autowired
    private RedisTemplate redisTemplate;



    @Test
    void contextLoadsSet() {

        redisTemplate.boundValueOps("name").set("xiaozhuzhu");
    }
    @Test
    void contextLoadsGet() {
        Object name = redisTemplate.boundValueOps("name").get();
        System.out.println(name);
    }

}
