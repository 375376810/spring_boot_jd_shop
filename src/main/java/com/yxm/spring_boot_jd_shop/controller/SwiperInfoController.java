package com.yxm.spring_boot_jd_shop.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yxm.spring_boot_jd_shop.domain.SwiperInfo;
import com.yxm.spring_boot_jd_shop.repository.SwiperItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
     *
     * @return
     */
    @RequestMapping(value = "/swiper_info", method = RequestMethod.GET)
    public String swiperInfo() {
        SwiperInfo info = new SwiperInfo();
        info.setNowtime(System.currentTimeMillis());
        //把所有的items查出来
        info.setSwiperItems(itemsRepository.findAll());
        info.setCode(200);
        //将信息转成json
        try {
            return new ObjectMapper().writeValueAsString(info);
        } catch (Exception e) {
            e.printStackTrace();
            return "{SwiperInfoController--swiperInfo转成json时出错}";
        }
    }

}
