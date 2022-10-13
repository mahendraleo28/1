package com.infinite.triangle1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    @SuppressWarnings("resource")
   
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Triangle12 Triangle12 = (Triangle12) context.getBean("Triangle12");
        Triangle12.draw();
    }
}