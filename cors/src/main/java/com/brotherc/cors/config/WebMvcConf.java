package com.brotherc.cors.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * <p>Title: WebMvcConf</p>
 * <p>Description：</p>
 *
 * @author abel
 * @date 2020年03月18日 11:07
 */
//@Configuration
//public class WebMvcConf implements WebMvcConfigurer {
//
//  @Override
//  public void addCorsMappings(CorsRegistry registry) {
//    registry.addMapping("/**")
//        .allowedOrigins("*") // 放行哪些域名
//        .allowCredentials(true) // 是否允许发送cookie信息
//        .allowedMethods("GET", "POST", "PUT", "DELETE") // 放行哪些http方法
//        .allowedHeaders("*"); // 放行哪些原始域
//
//  }
//
//}
