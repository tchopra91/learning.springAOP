package com.learning.springaop.service;

import com.learning.springaop.model.Circle;
import com.learning.springaop.model.Loggable;

public class ShapeService {
    private Circle circle;

    public Circle getCircle(String dummyArgument) {
        System.out.println("---> Cicle getter invoked");
        return circle;
    }

    public Circle getCircleWithException() {
        System.out.println("---> CicleWithException getter invoked");
        throw new RuntimeException("Throw getting circle exception");
        // return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }
}