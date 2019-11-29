package com.mooyle.goden.web.config;

import org.springframework.util.ObjectUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther marse
 * @Date 2019/11/29 11:17
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        String token = request.getHeader("Authorization");

        String origin = request.getHeader("Origin");
        if (!ObjectUtils.isEmpty(origin)) {
            response.setHeader("Access-Control-Allow-Origin", origin); // 允许访问的域
            response.setHeader("Access-Control-Allow-Methods", "POST,GET");// 允许GET、POST的外域请求
            response.setHeader("Access-Control-Allow-Credentials", "true"); // 允许请求带cookie到服务器
            response.setContentType("application/json; charset=utf-8"); // 设定JSON格式标准输出、及编码
        }
        return true;
    }
}
