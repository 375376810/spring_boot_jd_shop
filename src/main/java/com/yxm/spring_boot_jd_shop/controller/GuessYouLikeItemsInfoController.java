package com.yxm.spring_boot_jd_shop.controller;

import com.yxm.spring_boot_jd_shop.repository.GuessYouLikeItemsRepository;
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
 * Date: 2022/5/14
 * Time: 18:20
 * Description: 首页猜你喜欢模块接口
 */
@RestController
public class GuessYouLikeItemsInfoController {

    @Autowired
    private GuessYouLikeItemsRepository guessYouLikeItemsRepository;

    @RequestMapping(value = "/guess_you_like_items_info", produces = "application/json;charset=utf-8", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<LinkedHashMap<String, Object>> guessYouLikeItemsInfo() {
        LinkedHashMap<String, Object> data = JsonUtil.success();
        data.put("guessYouLikeItems", guessYouLikeItemsRepository.findAll());
        return ResponseEntity.ok(data);
    }

}
