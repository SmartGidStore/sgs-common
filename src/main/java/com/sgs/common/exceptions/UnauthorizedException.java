package com.sgs.common.exceptions;

public class UnauthorizedException extends Exception {

    public UnauthorizedException() {
        super("Unauthorized exception");
    }

    public UnauthorizedException(String s) {
        super(s);
    }

    public UnauthorizedException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public UnauthorizedException(Throwable throwable) {
        super(throwable);
    }

    public UnauthorizedException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
