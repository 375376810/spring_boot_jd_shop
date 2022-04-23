package com.yxm.spring_boot_jd_shop.domain;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: YXM
 * Date: 2022/4/22
 * Time: 21:01
 * Description: app端轮播图接口model
 */
public class SwiperInfo {

    private long nowtime;
    private int code;

    private List<SwiperItems> items;

    public SwiperInfo() {
    }

    public List<SwiperItems> getSwiperItems() {
        return items;
    }

    public void setSwiperItems(List<SwiperItems> items) {
        this.items = items;
    }

    public long getNowtime() {
        return nowtime;
    }

    public void setNowtime(long nowtime) {
        this.nowtime = nowtime;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
