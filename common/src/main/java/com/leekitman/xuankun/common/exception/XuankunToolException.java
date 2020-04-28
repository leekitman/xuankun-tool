package com.leekitman.xuankun.common.exception;

public class XuankunToolException extends Exception {
    public XuankunToolException() {
    }

    public XuankunToolException(String message) {
        super(message);
    }

    public XuankunToolException(String message, Throwable cause) {
        super(message, cause);
    }

    public XuankunToolException(Throwable cause) {
        super(cause);
    }

    public XuankunToolException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
