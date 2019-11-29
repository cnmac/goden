package com.mooyle.goden.web.config;

import com.mooyle.goden.common.redis.RedisClient;
import com.mooyle.goden.dao.mapper.GodenUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @Auther marse
 * @Date 2019/11/28 19:24
 */
@Configuration
public class MyMvcConfiguration implements WebMvcConfigurer {

    @Autowired
    GodenUserMapper godenUserDao;

    @Autowired
    RedisClient redisClient;

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(new UserInfoArgumentResolver(redisClient, godenUserDao));
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**");
    }
}
