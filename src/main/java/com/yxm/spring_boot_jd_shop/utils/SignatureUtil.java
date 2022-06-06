package com.yxm.spring_boot_jd_shop.utils;

import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Author: YXM
 * Date: 2022/6/6
 * Time: 22:33
 * Description:
 */
public class SignatureUtil {

    /**
     * 将传入的json签名并返回结果
     * @param tempJson
     * @return
     */
    public static String getSignature(LinkedHashMap<String, Object> tempJson) {
        ArrayList<String> attrKeys = new ArrayList<String>(tempJson.keySet());
        Collections.sort(attrKeys); //排序  ASCII 字符顺序进行升序排列
        String str = "";
        for (int i = 0; i < attrKeys.size(); i++) {
            str += attrKeys.get(i) + tempJson.get(attrKeys.get(i));
        }
        return DigestUtils.md5DigestAsHex(str.getBytes(StandardCharsets.UTF_8));
    }
}
