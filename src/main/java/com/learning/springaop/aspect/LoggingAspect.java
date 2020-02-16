package com.learning.springaop.aspect;

import com.learning.springaop.model.Circle;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    @Pointcut("execution(public com.learning.springaop.model.Circle getCircle())")
    public void pointBeforeCircleGetter() {
    }

    @Pointcut("execution(public com.learning.springaop.model.Circle com.learning.springaop.service.*.get*(..))")
    public void pointBeforeAllPublicServiceGettersReturningCircle() {
    }

    @Pointcut("execution(public com.learning.springaop.model.Circle get*())")
    public void pointBeforeAllPublicGettersReturningCircle() {
    }

    @Pointcut("execution(public * get*())")
    public void pointBeforeAllPublicGettersReturningAnything() {
    }

    @Pointcut("execution(* get*())")
    public void pointBeforeAllGetters() {
    }

    @Pointcut("execution(* get*(*))")
    public void pointBeforeAllGettersTakingSomeArgument() {
    }

    @Pointcut("execution(* get*(..))")
    public void pointBeforeAllGettersTakingNoOrSomeArgument() {
    }

    @Before("execution(* com.learning.springaop.service.*.get*(String, int)) and args(text, id)")
    public void logBeforeCircleGetter(int id, String text) {
        System.out.println("---> Logging before circle getter :: " + id + "|" + text);
    }

    @After("pointBeforeAllPublicServiceGettersReturningCircle()")
    public void logAfterCircleGetter() {
        System.out.println("---> Logging after circle getter");
    }

    @AfterReturning(pointcut = "pointBeforeAllPublicServiceGettersReturningCircle()", returning = "result")
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