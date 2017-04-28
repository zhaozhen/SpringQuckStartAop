package com.aop2.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by root on 2017/4/28.
 */
public class HijackAfterMethod implements AfterReturningAdvice {

    public void afterReturning(Object returnValue, Method method, Object[] args,
                               Object target) throws Throwable {
        System.out.println("HijackAfterMethod : After method hijacked!");

    }

}