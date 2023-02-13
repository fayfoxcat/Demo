package org.cat.springbootredis;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class SpringbootRedisApplicationTests {

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Test
    @Order(1)
    void redisOpsSet() {
        redisTemplate.opsForValue().set("key", "不要回答！不要回答！不要回答！");
    }
    @Test
    @Order(2)
    void redisOpsGet() {
        System.out.println(redisTemplate.opsForValue().get("key"));
    }

    @Test
    @Order(3)
    void redisBoundSet() {
        redisTemplate.boundValueOps("key").set("主不在乎");
    }

    @Test
    @Order(4)
    void redisBoundGet() {
        System.out.println(redisTemplate.boundValueOps("key").get());
    }

}
