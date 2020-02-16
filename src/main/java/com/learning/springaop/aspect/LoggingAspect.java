package com.learning.springaop.aspect;

import com.learning.springaop.model.Circle;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(public com.learning.springaop.model.Circle getCircle())")
    public void logBeforeCircleGetter() {
        System.out.println("---> Logging before circle getter");
    }

    public void logAfterCircleGetter() {
        System.out.println("---> Logging after circle getter");
    }

    public void logAfterReturningCircleGetter(Circle result) {
        System.out.println("---> Logging after returning circle getter :: " + result);
    }

    public void logAfterThrowingCircleGetter(Exception exp) {
        System.out.println("---> Logging after throwing circle getter :: " + exp);
    }

    public void logAfterAroundCircleGetter(ProceedingJoinPoint pjp) {
        try {
            System.out.println("---> Logging after around circle getter :: Before running method");
            pjp.proceed();
            System.out.println("---> Logging after around circle getter :: After running method");
        } catch (Throwable e) {
            System.out.println("---> Logging after around circle getter :: On throwing");
        } finally {
            System.out.println("---> Logging after around circle getter :: Finally");
        }
    }

    public void beforeLoggableMethod() {
        System.out.println("---> Logging before loggable method");
    }
}