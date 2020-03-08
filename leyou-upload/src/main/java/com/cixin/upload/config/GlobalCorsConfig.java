package com.cixin.upload.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * 处理跨域请求的过滤器
 */
@Configuration
public class GlobalCorsConfig {

    @Bean
    public CorsFilter corsFilter(){
        //1.添加CORS配置信息
        CorsConfiguration config=new CorsConfiguration();
        //1.允许的域，不能写*,否则cookie无法使用
        config.addAllowedOrigin("http://manage.leyou.com");
        //2.允许发送Cookie信息
        config.setAllowCredentials(false);

        //3) 允许的请求方式
        config.addAllowedMethod("OPTIONS");
        config.addAllowedMethod("POST");
        config.addAllowedHeader("*");

        //2.添加映射路径，拦截一切请求
        UrlBasedCorsConfigurationSource configurationSource=new UrlBasedCorsConfigurationSource();
        configurationSource.registerCorsConfiguration("/**",config);

        //3.返回新的CorsFilter
        return  new CorsFilter(configurationSource);
    }

}
