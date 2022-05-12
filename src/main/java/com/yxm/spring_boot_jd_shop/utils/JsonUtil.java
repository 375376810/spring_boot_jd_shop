package com.yxm.spring_boot_jd_shop.utils;

import com.yxm.spring_boot_jd_shop.pubs.ResponseCode;

import java.util.LinkedHashMap;

/**
 * Created with IntelliJ IDEA.
 * Author: YXM
 * Date: 2022/4/25
 * Time: 0:45
 * Description:
 */
public class JsonUtil {

    /**
     * 生成一个带code和time的成功的json
     * @return 带code和time的成功的json
     */
    public static LinkedHashMap<String, Object> success() {
        LinkedHashMap<String, Object> data = new LinkedHashMap<>();
        data.put("code", ResponseCode.SUCCESS);
        data.put("time",System.currentTimeMillis());
        return data;
    }

    /**
     * 生成一个带msg信息的错误json
     * @param msg 错误信息
     * @return 带msg信息的错误json
     */
    public static LinkedHashMap<String, Object> error(String msg) {
        LinkedHashMap<String, Object> data = new LinkedHashMap<>();
        data.put("code", ResponseCode.ERROR);
        data.put("time",System.currentTimeMillis());
        data.put("msg", msg);
        return data;
    }

}
