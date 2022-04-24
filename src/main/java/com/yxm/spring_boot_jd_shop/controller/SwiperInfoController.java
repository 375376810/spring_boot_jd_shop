package com.yxm.spring_boot_jd_shop.controller;

import com.yxm.spring_boot_jd_shop.repository.SwiperItemsRepository;
import com.yxm.spring_boot_jd_shop.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;

/**
 * Created with IntelliJ IDEA.
 * Author: YXM
 * Date: 2022/4/22
 * Time: 22:38
 * Description: 轮播图信息controller
 */
@RestController
public class SwiperInfoController {
    @Autowired
    private SwiperItemsRepository itemsRepository;

    /**
     * 轮播图接口
     * @return
     */
    @RequestMapping(value = "/swiper_info",produces = "application/json;charset=utf-8", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<LinkedHashMap<String, Object>> swiperInfo() {
        LinkedHashMap<String, Object> data = JsonUtil.success();
        data.put("swiperItems",itemsRepository.findAll());
        return ResponseEntity.ok(data);
    }

}
