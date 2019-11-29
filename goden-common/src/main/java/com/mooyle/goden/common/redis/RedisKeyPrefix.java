package com.mooyle.goden.common.redis;

/**
 * @Auther marse
 * @Date 2019/11/28 19:05
 */
public class RedisKeyPrefix {

    private String prefix;

    public String getPrefix() {
        return this.prefix;
    }

    public int expireSeconds() {
        return 1000;
    }
}
