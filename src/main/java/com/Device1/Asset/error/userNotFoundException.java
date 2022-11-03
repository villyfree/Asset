package com.Device1.Asset.error;

public class userNotFoundException extends Exception {
    public userNotFoundException(String message) {
        super();
    }
    public userNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public userNotFoundException(Throwable cause) {
        super(cause);
    }

    protected userNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
