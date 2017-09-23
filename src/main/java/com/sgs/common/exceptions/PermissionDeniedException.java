package com.sgs.common.exceptions;

public class PermissionDeniedException extends Exception{

    public PermissionDeniedException() {
        super("Permission denied exception");
    }

    public PermissionDeniedException(String s) {
        super(s);
    }

    public PermissionDeniedException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public PermissionDeniedException(Throwable throwable) {
        super(throwable);
    }

    public PermissionDeniedException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
