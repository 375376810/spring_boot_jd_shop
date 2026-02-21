package com.yxm.spring_boot_jd_shop.configs;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsFilterConfig {

    @Bean
    public CorsFilter corsFilter() {
        // 1. 配置跨域规则
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOriginPattern("*");
        config.addAllowedMethod("*"); // 允许所有请求方法
        config.addAllowedHeader("*"); // 允许所有请求头
        config.setAllowCredentials(true); // 允许携带Cookie
        config.setMaxAge(3600L); // 预检请求缓存1小时

        // 2. 配置生效路径：覆盖所有路径（包括图片）
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        // 关键：/** 覆盖接口 + 静态资源
        source.registerCorsConfiguration("/**", config);

        // 3. 返回过滤器（优先级最高）
        return new CorsFilter(source);
    }
}