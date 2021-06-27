package com.lzx.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect//标注这个类是一个切面
public class AnnotationPointCut {

    @Before("execution(* com.lzx.service.UserServiceImpl.*(..))")
    void before(){
        System.out.println("方法执行前");
    }

    @After("execution(* com.lzx.service.UserServiceImpl.*(..))")
    void after(){
        System.out.println("方法执行后");
    }

    @Around("execution(* com.lzx.service.UserServiceImpl.*(..))")
    void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前面");

        System.out.println(joinPoint.getSignature());
        Object proceed = joinPoint.proceed();
        System.out.println("环绕后");
        System.out.println(proceed);
    }

}
