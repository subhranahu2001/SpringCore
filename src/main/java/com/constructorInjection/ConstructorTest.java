package com.constructorInjection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorTest {

    @Test
    public void constructorInjectionTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorInjection.xml");
        Student student = (Student) context.getBean("std");
        System.out.println("Student: " + student);
    }
}
