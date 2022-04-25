package com.yxm.spring_boot_jd_shop.controller;

import com.yxm.spring_boot_jd_shop.repository.CategoryItemsRepository;
import com.yxm.spring_boot_jd_shop.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;

/**
 * Created with IntelliJ IDEA.
 * Author: YXM
 * Date: 2022/4/25
 * Time: 19:14
 * Description: 分类页右侧元素接口
 */
@RestController
public class CategoryItemsInfoController {
    @Autowired
    private CategoryItemsRepository categoryItemsRepository;

    @RequestMapping(value = "/category_items_info",produces = "application/json;charset=utf-8", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<LinkedHashMap<String, Object>> categoryItemsInfo(@RequestParam("category_list_id") long categoryListId) {
        LinkedHashMap<String, Object> data = JsonUtil.success();
        data.put("categoryItems",categoryItemsRepository.findAllByCategoryListId(categoryListId));
        return ResponseEntity.ok(data);
    }

}
