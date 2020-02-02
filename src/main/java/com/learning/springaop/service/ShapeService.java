package com.learning.springaop.service;

import com.learning.springaop.model.Circle;

public class ShapeService {
    private Circle circle;

    public Circle getCircle(String dummyText, int dummyId) {
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