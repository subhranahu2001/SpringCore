package com.core;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }
    @Test
    public void coreTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("core.xml");
        Student s = context.getBean("std",Student.class);
        System.out.println(s);
    }
}
