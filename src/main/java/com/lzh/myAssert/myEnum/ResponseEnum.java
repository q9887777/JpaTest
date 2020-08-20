package com.lzh.myAssert.myEnum;

import com.lzh.myAssert.BusinessExceptionAssert;

public enum ResponseEnum implements BusinessExceptionAssert {
    BAD_NOT_NULL(7001,"null");
    /**
     * 返回码
     */
    private int code;
    /**
     * 返回消息
     */
    private String message;

    ResponseEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
