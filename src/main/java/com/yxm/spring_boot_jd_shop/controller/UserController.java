package com.yxm.spring_boot_jd_shop.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yxm.spring_boot_jd_shop.domain.User;
import com.yxm.spring_boot_jd_shop.repository.UserRepository;
import com.yxm.spring_boot_jd_shop.utils.JsonUtil;
import com.yxm.spring_boot_jd_shop.utils.SignatureUtil;
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

    /**
     * 修改收货地址
     *
     * @param requestData 签名后的userJson
     * @return
     */
    @RequestMapping(value = "/edit_address", produces = "application/json;charset=utf-8", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<LinkedHashMap<String, Object>> editAddress(@RequestBody LinkedHashMap<String, Object> requestData) {
        String requestSign = (String) requestData.get("sign");
        //需要验证签名的只有这几个字段
        int id = (int) requestData.get("id");
        String userName = (String) requestData.get("userName");
        String address = (String) requestData.get("address");
        String address2 = (String) requestData.get("address2");
        //从数据库中取出salt
        User user = userRepository.findById(id);
        String salt = user.getSalt();
        //组装服务端json
        LinkedHashMap<String, Object> tempJson = new LinkedHashMap<String, Object>();
        tempJson.put("id", id);
        tempJson.put("userName", userName);
        tempJson.put("address", address);
        tempJson.put("address2", address2);
        tempJson.put("salt", salt);
        //签名
        String responseSign = SignatureUtil.getSignature(tempJson);
        //对比请求端和服务器端的签名是否一致
        ObjectMapper mapper = new ObjectMapper();
        LinkedHashMap<String, Object> data;
        if (requestSign.equals(responseSign)) {
            //更新user表
            user.setAddress(address);
            user.setAddress2(address2);
            userRepository.save(user);
            //返回code200
            data = JsonUtil.success();
        } else {
            data = JsonUtil.error("签名不一致,拒绝访问!");
        }
        return ResponseEntity.ok(data);
    }

}
