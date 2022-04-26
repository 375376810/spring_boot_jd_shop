package com.yxm.spring_boot_jd_shop.controller;

import com.yxm.spring_boot_jd_shop.repository.CategoryListRepository;
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
 * Date: 2022/4/25
 * Time: 21:35
 * Description: 分类页左侧列表元素接口
 */
@RestController
public class CategoryListInfoController {

    @Autowired
    private CategoryListRepository categoryListRepository;

    @RequestMapping(value = "/category_list_info", produces = "application/json;charset=utf-8", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<LinkedHashMap<String, Object>> categoryListInfo() {
        LinkedHashMap<String, Object> data = JsonUtil.success();
        data.put("categoryList", categoryListRepository.findAll());
        return ResponseEntity.ok(data);
    }

}
