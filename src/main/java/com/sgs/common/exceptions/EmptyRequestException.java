package com.sgs.common.exceptions;

public class EmptyRequestException extends Exception {

    public EmptyRequestException() {
        super("Some fields are empty");
    }

    public EmptyRequestException(String s) {
        super(s);
    }

    public EmptyRequestException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public EmptyRequestException(Throwable throwable) {
        super(throwable);
    }

    public EmptyRequestException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
