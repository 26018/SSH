package com.jh.ssh.domain;

public enum ResultEnum {
    UNKNOWN_ERROR(-1,"未知错误"),
    SUCCESS(200,"请求成功"),
    DATA_IS_NULL(402,"请求数据为空"),
    ;
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
