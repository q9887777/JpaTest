package com.lzh.myAssert.exception;

import com.lzh.myAssert.myEnum.IResponseEnum;

public class BusinessException extends  BaseException {
    public BusinessException(IResponseEnum iResponseEnum, Object[] args, String message) {
        super(iResponseEnum, args, message);
    }

    public BusinessException(String message, IResponseEnum iResponseEnum, Object[] args, String message1) {
        super(message, iResponseEnum, args, message1);
    }

    public BusinessException(String message, Throwable cause, IResponseEnum iResponseEnum, Object[] args, String message1) {
        super(message, cause, iResponseEnum, args, message1);
    }

    public BusinessException(Throwable cause, IResponseEnum iResponseEnum, Object[] args, String message) {
        super(cause, iResponseEnum, args, message);
    }

    public BusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, IResponseEnum iResponseEnum, Object[] args, String message1) {
        super(message, cause, enableSuppression, writableStackTrace, iResponseEnum, args, message1);
    }
}
