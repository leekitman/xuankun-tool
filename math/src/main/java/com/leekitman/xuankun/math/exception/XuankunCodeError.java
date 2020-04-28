package com.leekitman.xuankun.math.exception;

import com.leekitman.xuankun.common.exception.XuankunToolException;

public class XuankunCodeError extends XuankunToolException {

    public XuankunCodeError() {
    }

    public XuankunCodeError(String message) {
        super(message);
    }

    public XuankunCodeError(String message, Throwable cause) {
        super(message, cause);
    }

    public XuankunCodeError(Throwable cause) {
        super(cause);
    }

    public XuankunCodeError(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
