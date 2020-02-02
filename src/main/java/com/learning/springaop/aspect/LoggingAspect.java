package com.learning.springaop.aspect;

import com.learning.springaop.model.Circle;

public class LoggingAspect {

    public void logBeforeCircleGetter(int id, String text) {
        System.out.println("---> Logging before circle getter :: " + id + " | " + text);
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
}