package com.learning.springaop.aspect;

import org.aspectj.lang.JoinPoint;

public class LoggingAspect {

    public void logBeforeCircleGetter(JoinPoint joinPoint) {
        System.out.println("---> Logging before circle getter :: " + joinPoint.getSignature());
    }
}