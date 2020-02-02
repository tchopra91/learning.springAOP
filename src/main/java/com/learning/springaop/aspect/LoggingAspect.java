package com.learning.springaop.aspect;

public class LoggingAspect {

    public void logBeforeCircleGetter() {
        System.out.println("---> Logging before circle getter");
    }
}