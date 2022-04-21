package com.yxm.spring_boot_jd_shop;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yxm.spring_boot_jd_shop.domain.User;
import com.yxm.spring_boot_jd_shop.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;

@SpringBootTest(classes = SpringBootJDShopApplication.class)
public class SpringBootJDShopApplicationTests {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Autowired
    private UserRepository userRepository;

    @Test
    void test01() {
        List<User> all = userRepository.findAll();
        System.out.println(all);
    }

    @Test
    public void test02() {
        User user = new User("小红", "123345", "小晓红");
        userRepository.save(user);
    }

    @Test
    public void testRedis() throws JsonProcessingException {
        //1.从redis中获得数据,数据的形式json字符串
        String userListJson = redisTemplate.boundValueOps("user.findAll").get();
        //2.判断redis中是否存在数据
        if (null == userListJson) {
            //3.不存在数据,从数据库查询
            List<User> all = userRepository.findAll();
            //利用jackson将list转换为json字符串
            userListJson = new ObjectMapper().writeValueAsString(all);
            //向redis服务器中插入数据
            redisTemplate.boundValueOps("user.findAll").set(userListJson);
            System.out.println("============ 从数据库中获得user的数据 ============");
        } else {
            System.out.println("================ 从redis中获得user的数据 ================");
        }
        //4.将数据在控制台打印
        System.out.println(userListJson);
    }

}
