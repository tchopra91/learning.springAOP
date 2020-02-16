package com.learning.springaop;

import com.learning.springaop.service.ShapeService;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        try {

            ShapeService shapeService = (ShapeService) context.getBean("ShapeService");
            shapeService.getCircle();

            // shapeService.getCircleWithException();
        } catch (Exception e) {
            // System.out.println("---> Exception occured :: " + e.getMessage());
        }

        context.close();
    }

}
