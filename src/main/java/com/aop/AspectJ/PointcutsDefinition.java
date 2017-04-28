package com.aop.AspectJ;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by root on 2017/4/28.
 */
@Aspect
public class PointcutsDefinition {

    @Pointcut("execution(* com.aop.AspectJ.CustomerBo.*(..))")
    public void customerLog() {
//        System.out.print("------------------------------------------------pointCut-----------------------------");
    }
}