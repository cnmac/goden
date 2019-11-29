package com.mooyle.goden.common;

public enum ResultEnum {

    SUCCESS(0, "成功"),
    NOTFOUND(404, "未找到")
    ;

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }


}