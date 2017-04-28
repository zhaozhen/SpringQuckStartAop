package com.aop2.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by root on 2017/4/28.
 */
public class HijackBeforeMethod implements MethodBeforeAdvice {

    public void before(Method arg0, Object[] args, Object target)
            throws Throwable {
        System.out.println("HijackBeforeMethod : Before method hijacked!");

    }

}