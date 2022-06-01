package com.yxm.spring_boot_jd_shop.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yxm.spring_boot_jd_shop.domain.User;
import com.yxm.spring_boot_jd_shop.repository.UserRepository;
import com.yxm.spring_boot_jd_shop.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: YXM
 * Date: 2020/2/6
 * Time: 14:00
 * Description:
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    /**
     * 保存用户(注册)
     *
     * @param userJson
     * @return
     */
    @RequestMapping(value = "/save_user", produces = "application/json;charset=utf-8", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<LinkedHashMap<String, Object>> saveUser(@RequestBody LinkedHashMap<String, Object> userJson) {
        ObjectMapper mapper = new ObjectMapper();
        LinkedHashMap<String, Object> data;
        try {
            User user = mapper.convertValue(userJson, User.class);
            //生成salt
            long time = System.currentTimeMillis();
            String salt = DigestUtils.md5DigestAsHex((userJson.toString() + time).getBytes(StandardCharsets.UTF_8));
            user.setSalt(salt);
            userRepository.save(user);
            data = JsonUtil.success();
        } catch (Exception e) {
            data = JsonUtil.error("用户数据有错误,无法保存 : " + e.toString());
            e.printStackTrace();
        }
        return ResponseEntity.ok(data);
    }

    /**
     * 通过用户名和密码获取用户信息(登录)
     *
     * @param userName
     * @param password
     * @return
     */
    @RequestMapping(value = "/login", produces = "application/json;charset=utf-8", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<LinkedHashMap<String, Object>> login(@RequestParam("user_name") String userName, @RequestParam("password") String password) {
        LinkedHashMap<String, Object> data = JsonUtil.success();
        List<User> users = userRepository.findAllByUserNameAndPassword(userName, password);
        if (!users.isEmpty()) {
            data.put("user", users.get(0));
        } else {
            data.put("user", null);
        }
        return ResponseEntity.ok(data);
    }

    /**
     * 通过用户名查找用户信息(查询用户名已被注册)
     *
     * @param userName
     * @return
     */
    @RequestMapping(value = "/is_user_exists", produces = "application/json;charset=utf-8", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<LinkedHashMap<String, Object>> isUserExists(@RequestParam("user_name") String userName) {
        LinkedHashMap<String, Object> data = JsonUtil.success();
        List<User> users = userRepository.findAllByUserName(userName);
        if (!users.isEmpty()) {
            data.put("is_user_exists", true);
        } else {
            data.put("is_user_exists", false);
        }
        return ResponseEntity.ok(data);
    }

}
