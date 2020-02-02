package com.learning.springaop.aspect;

public class LoggingAspect {

    public void logBeforeCircleGetter(int id, String text) {
        System.out.println("---> Logging before circle getter :: " + id + " | " + text);
    }

    public void logAfterCircleGetter() {
        System.out.println("---> Logging after circle getter");
    }
}