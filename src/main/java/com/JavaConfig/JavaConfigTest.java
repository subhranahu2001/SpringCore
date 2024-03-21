package com.JavaConfig;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigTest {

    @Test
    public void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Student student = (Student) context.getBean("student");
        System.out.println(student);
        student.getTeacher().m1();
        System.out.println(student.getTeacher().getName());
    }
}
