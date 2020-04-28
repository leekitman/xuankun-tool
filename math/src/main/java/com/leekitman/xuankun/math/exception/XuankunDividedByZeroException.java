package com.leekitman.xuankun.math.exception;

public class XuankunDividedByZeroException extends RuntimeException {
    public XuankunDividedByZeroException() {
    }

    public XuankunDividedByZeroException(String message) {
        super(message);
    }

    public XuankunDividedByZeroException(String message, Throwable cause) {
        super(message, cause);
    }

    public XuankunDividedByZeroException(Throwable cause) {
        super(cause);
    }

    public XuankunDividedByZeroException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
