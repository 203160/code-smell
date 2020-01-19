package com.danix.code.smell.example001;

import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

/**
 * @author  danix
 */
public class MyRuntimeExceptionTest {

    @Test(expected= MyRuntimeException.class)
    public void myTest() {
        throwMyRuntimeException();
    }

    void throwMyRuntimeException() {
        throw new MyRuntimeException("exception");
    }
}
