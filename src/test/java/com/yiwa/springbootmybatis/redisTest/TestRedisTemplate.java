package com.yiwa.springbootmybatis.redisTest;

import com.yiwa.springbootmybatis.SpringbootMybatisApplication;
import com.yiwa.springbootmybatis.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMybatisApplication.class)
public class TestRedisTemplate {
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void testString(){
        redisTemplate.opsForValue().set("yiwa","qiangqiang");
        System.out.println(redisTemplate.opsForValue().get("yiwa"));

    }
    @Test
    public void teest(){
        User user=new User(Long.valueOf(4),"悟空","123456","男","齐天大圣");
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set("com.yiwa",user);
        User u1= (User) valueOperations.get("com.yiwa");
        System.out.println(u1);
    }

    @Test
    public void testq() throws Exception{
        User user=new User(Long.valueOf(5),"八戒","123456","男","天蓬元帅");
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set("com.tianpeng",user,100, TimeUnit.MILLISECONDS);
        Thread.sleep(50);
        Boolean aBoolean = redisTemplate.hasKey("com.tianpeng");
        if (aBoolean)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
