package com.danix.code.smell.example001;

public class MyRuntimeException extends RuntimeException {
    public MyRuntimeException() {
        super();
    }
    public MyRuntimeException(String s) {
        super(s);
    }
    public MyRuntimeException(String s, Throwable throwable) {
        super(s, throwable);
    }
    public MyRuntimeException(Throwable throwable) {
        super(throwable);
    }
}