package com.lzh.myAssert.exception;

import com.lzh.myAssert.myEnum.IResponseEnum;

public class BaseException extends Exception {

    private IResponseEnum iResponseEnum;
    private Object[] args;
    private String message;

    public BaseException(IResponseEnum iResponseEnum, Object[] args, String message) {
        this.iResponseEnum = iResponseEnum;
        this.args = args;
        this.message = message;
    }

    public BaseException(String message, IResponseEnum iResponseEnum, Object[] args, String message1) {
        super(message);
        this.iResponseEnum = iResponseEnum;
        this.args = args;
        this.message = message1;
    }

    public BaseException(String message, Throwable cause, IResponseEnum iResponseEnum, Object[] args, String message1) {
        super(message, cause);
        this.iResponseEnum = iResponseEnum;
        this.args = args;
        this.message = message1;
    }

    public BaseException(Throwable cause, IResponseEnum iResponseEnum, Object[] args, String message) {
        super(cause);
        this.iResponseEnum = iResponseEnum;
        this.args = args;
        this.message = message;
    }

    public BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, IResponseEnum iResponseEnum, Object[] args, String message1) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.iResponseEnum = iResponseEnum;
        this.args = args;
        this.message = message1;
    }

    public IResponseEnum getiResponseEnum() {
        return iResponseEnum;
    }

    public void setiResponseEnum(IResponseEnum iResponseEnum) {
        this.iResponseEnum = iResponseEnum;
    }

    public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
