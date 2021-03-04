package com.alexcode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeapplicationContext.xml");

        Coach theCoach = context.getBean("myCoach",Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        boolean result = (theCoach == alphaCoach);

        System.out.println("\n Pointing to the some object " + result);

        System.out.println("\n Memory location for theCoach " + theCoach);
        System.out.println("\n Memory location for alphaCoach " + alphaCoach);

        context.close();

    }
}
