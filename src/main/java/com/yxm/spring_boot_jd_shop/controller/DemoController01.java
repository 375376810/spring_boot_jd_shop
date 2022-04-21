package com.yxm.spring_boot_jd_shop.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yxm.spring_boot_jd_shop.domain.User;
import com.yxm.spring_boot_jd_shop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: YXM
 * Date: 2020/2/6
 * Time: 14:00
 * Description:
 */
@RestController
public class DemoController01 {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/show")
    public String show() {
        return "你好啊,这是首页";
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String info() {
        System.out.println("收到一个get请求");
        return "哈哈,祝你好运";
    }

    /**
     * 保存用户
     */
    @RequestMapping(value = "/save_user",method = RequestMethod.POST)
    public void saveUser(@RequestBody User user) {
        System.out.println(user);
        System.out.println("保存成功");
        userRepository.save(user);
    }

    /**
     * 从数据库或redis中查找所有user
     * @return
     */
    @RequestMapping(value = "/get_all_user",method = RequestMethod.GET)
    public String getAllUser() throws JsonProcessingException {
        List<User> all = userRepository.findAll();
        return  new ObjectMapper().writeValueAsString(all);
    }

}
