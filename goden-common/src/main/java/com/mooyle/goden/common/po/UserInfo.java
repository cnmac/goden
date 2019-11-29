package com.mooyle.goden.common.po;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

/**
 * @Auther marse
 * @Date 2019/11/28 19:14
 */
public class UserInfo {

    private Long id;


    private String nickname;


    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken(UserInfo userInfo) {
        String token = "";
        token = JWT.create().withAudience(userInfo.getId().toString())
                .sign(Algorithm.HMAC256(userInfo.getPassword()));
        return token;
    }

}
