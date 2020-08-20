package com.lzh.myAssert;

import com.lzh.myAssert.exception.BaseException;
import com.lzh.myAssert.exception.BusinessException;
import com.lzh.myAssert.myEnum.IResponseEnum;

import java.text.MessageFormat;
/**
 * <p>业务异常</p>
 * <p>业务处理时，出现异常，可以抛出该异常</p>
 */
public interface BusinessExceptionAssert extends IResponseEnum, Assert{
    @Override
    default BaseException newException(Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);
        return new BusinessException(this, args, msg);
    }

    @Override
    default BaseException newException(Throwable t, Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);
        return new BusinessException(t, this, args, msg);
    }
}
