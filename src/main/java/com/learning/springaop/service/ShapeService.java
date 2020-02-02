package com.learning.springaop.service;

import com.learning.springaop.model.Circle;

public class ShapeService {
    private Circle circle;

    public Circle getCircle(String dummyArgument) {
        System.out.println("---> Cicle getter invoked");
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }
}