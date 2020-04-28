package com.leekitman.xuankun.math.exception;

public class XuankunNullArgumentException extends RuntimeException {

    public XuankunNullArgumentException() {
    }

    public XuankunNullArgumentException(String message) {
        super(message);
    }

    public XuankunNullArgumentException(String message, Throwable cause) {
        super(message, cause);
    }

    public XuankunNullArgumentException(Throwable cause) {
        super(cause);
    }

    public XuankunNullArgumentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
