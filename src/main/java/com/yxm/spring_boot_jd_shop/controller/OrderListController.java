package com.yxm.spring_boot_jd_shop.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yxm.spring_boot_jd_shop.domain.OrderListItem;
import com.yxm.spring_boot_jd_shop.domain.User;
import com.yxm.spring_boot_jd_shop.repository.OrderListItemRepository;
import com.yxm.spring_boot_jd_shop.repository.UserRepository;
import com.yxm.spring_boot_jd_shop.utils.JsonUtil;
import com.yxm.spring_boot_jd_shop.utils.SignatureUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: YXM
 * Date: 2022/6/7
 * Time: 15:39
 * Description:
 */
@RestController
public class OrderListController {

    @Autowired
    private OrderListItemRepository orderListItemRepository;
    @Autowired
    private UserRepository userRepository;

    /**
     * 保存订单
     *
     * @param requestData
     * @return
     */
    @RequestMapping(value = "/save_order_list", produces = "application/json;charset=utf-8", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<LinkedHashMap<String, Object>> saveOrderList(@RequestBody LinkedHashMap<String, Object> requestData) {
        String requestSign = (String) requestData.get("sign");
        //需要验证签名的只有这几个字段
        int user_id = (int) requestData.get("user_id");
        //从数据库中取出salt
        User user = userRepository.findById(user_id);
        String salt = user.getSalt();
        //组装服务端json
        LinkedHashMap<String, Object> tempJson = new LinkedHashMap<String, Object>();
        tempJson.put("user_id", user_id);
        //tempJson.put("orderList", requestData.get("orderList"));
        tempJson.put("salt", salt);
        //签名
        String responseSign = SignatureUtil.getSignature(tempJson);
        //对比请求端和服务器端的签名是否一致
        LinkedHashMap<String, Object> data;
        if (requestSign.equals(responseSign)) {
            try {
                ObjectMapper mapper = new ObjectMapper();
                List<OrderListItem> orderList = mapper.convertValue(requestData.get("orderList"), new TypeReference<List<OrderListItem>>() {
                });
                //保存订单表
                orderListItemRepository.saveAll(orderList);
                //先保存一条
                //orderListItemRepository.save(orderList.get(0));
                //返回code200
                data = JsonUtil.success();
            } catch (Exception e) {
                data = JsonUtil.error("保存失败!订单列表获取失败" + e.toString());
                e.printStackTrace();
            }
        } else {
            data = JsonUtil.error("签名不一致,拒绝访问!");
        }
        return ResponseEntity.ok(data);
    }

    /**
     * 通过user_id获取订单列表
     *
     * @param requestData user_id,sign
     * @return
     */
    @RequestMapping(value = "/get_order_list_by_user_id", produces = "application/json;charset=utf-8", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<LinkedHashMap<String, Object>> getOrderListByUserId(@RequestParam("user_id") LinkedHashMap<String, Object> requestData) {
        LinkedHashMap<String, Object> data;
        String requestSign = (String) requestData.get("sign");
        //需要验证签名的只有这几个字段
        int user_id = (int) requestData.get("user_id");
        //从数据库中取出salt
        User user = userRepository.findById(user_id);
        String salt = user.getSalt();
        //组装服务端json
        LinkedHashMap<String, Object> tempJson = new LinkedHashMap<String, Object>();
        tempJson.put("user_id", user_id);
        tempJson.put("salt", salt);
        //签名
        String responseSign = SignatureUtil.getSignature(tempJson);
        //对比请求端和服务器端的签名是否一致
        if (requestSign.equals(responseSign)) {
            try {
                //从数据库取数据
                List<OrderListItem> orderList = orderListItemRepository.findAllByUserId((long) user_id);
                //返回code200
                data = JsonUtil.success();
                data.put("orderList", orderList);
            } catch (Exception e) {
                data = JsonUtil.error("获取订单失败 : " + e.toString());
                e.printStackTrace();
            }
        } else {
            data = JsonUtil.error("签名不一致,拒绝访问!");
        }
        return ResponseEntity.ok(data);
    }

}
