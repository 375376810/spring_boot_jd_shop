package com.yxm.spring_boot_jd_shop.controller;

import com.yxm.spring_boot_jd_shop.domain.HotProductItems;
import com.yxm.spring_boot_jd_shop.repository.HotProductItemsRepository;
import com.yxm.spring_boot_jd_shop.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: YXM
 * Date: 2022/5/12
 * Time: 19:07
 * Description: 主页热门商品接口
 */
@RestController
public class HotProductItemsInfoController {

    @Autowired
    private HotProductItemsRepository hotProductItemsRepository;

    /**
     * 获取热门商品总数量
     */
    @RequestMapping(value = "/get_hot_product_items_count",produces = "application/json;charset=utf-8", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<LinkedHashMap<String, Object>> getHotProductItemsCount(){
        LinkedHashMap<String, Object> data = JsonUtil.success();
        data.put("HotProductItemsCount", hotProductItemsRepository.count());
        return ResponseEntity.ok(data);
    }

    /**
     * 获取热门商品分页方式
     */
    @RequestMapping(value = "/get_hot_product_items_by_page",produces = "application/json;charset=utf-8", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<LinkedHashMap<String, Object>> getHotProductItemsByPage(@RequestParam("page_number") int  PageNumber, @RequestParam("page_size") int pageSize){
        List<HotProductItems> hotProductItemsByPage = hotProductItemsRepository.findAll(PageRequest.of(PageNumber,pageSize)).getContent();
        LinkedHashMap<String, Object> data = JsonUtil.success();
        data.put("hotProductItemsByPage", hotProductItemsByPage);
        return ResponseEntity.ok(data);
    }

}
