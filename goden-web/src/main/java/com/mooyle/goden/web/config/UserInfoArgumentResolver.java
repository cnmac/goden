package com.mooyle.goden.web.config;

import com.mooyle.goden.common.po.UserInfo;
import com.mooyle.goden.common.redis.RedisClient;
import com.mooyle.goden.dao.mapper.GodenUserMapper;
import com.mooyle.goden.domain.model.GodenUser;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther marse
 * @Date 2019/11/28 15:17
 */
public class UserInfoArgumentResolver implements HandlerMethodArgumentResolver {

    private RedisClient redisClient;

    private GodenUserMapper godenUserMapper;

    public UserInfoArgumentResolver(RedisClient redisClient, GodenUserMapper godenUserMapper){
        this.redisClient = redisClient;
        this.godenUserMapper = godenUserMapper;
    }

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return UserInfo.class.isAssignableFrom(parameter.getParameterType());
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        HttpServletRequest nativeRequest = (HttpServletRequest) nativeWebRequest.getNativeRequest();
        String token = nativeRequest.getHeader("token");
//        Long userId = redisClient.get(token);
        GodenUser godenUser = godenUserMapper.selectByPrimaryKey(1l);
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(godenUser, userInfo);
        return userInfo;
    }


}
