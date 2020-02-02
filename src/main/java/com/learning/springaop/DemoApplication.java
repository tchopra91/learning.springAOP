package com.learning.springaop;

import com.learning.springaop.service.ShapeService;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ShapeService shapeService = (ShapeService) context.getBean("shapeService");
        shapeService.getCircle("dummy text", 1000);

        context.close();
    }

}
