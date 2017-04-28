package com.aop.AspectJ;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by root on 2017/4/28.
 */
@Aspect
public class LoggingAspect {
    //将 Advice 和 Pointcut 不分开
//    @Before("execution(public * com.aop.AspectJ.CustomerBo.addCustomer(..))")
//    public void logBefore(JoinPoint joinPoint) {
//        System.out.println("logBefore() is running ...");
//        System.out.println("hijacked:" + joinPoint.getSignature().getName());
//        System.out.println("**********");
//    }
//
//    @After("execution(public * com.aop.AspectJ.CustomerBo.deleteCustomer(..))")
//    public void logAfter(JoinPoint joinPoint) {
//        System.out.println("logAfter() is running ...");
//        System.out.println("hijacked:" + joinPoint.getSignature().getName());
//        System.out.println("**********");
//    }
    //将 Advice 和 Pointcut 分开
    @Before("com.aop.AspectJ.PointcutsDefinition.customerLog()")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("logBefore() is running ...");
        System.out.println("hijacked:" + joinPoint.getSignature().getName());
        System.out.println("**********-------------------------------");
    }

    @After("com.aop.AspectJ.PointcutsDefinition.customerLog()")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("logAfter() is running ...");
        System.out.println("hijacked:" + joinPoint.getSignature().getName());
        System.out.println("**********-------------------------------");
    }
}
