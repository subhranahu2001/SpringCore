package com.JavaConfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.JavaConfig")
public class JavaConfig {

    @Bean
    public Teacher teacher() {

        return Teacher.builder()
                .name("Durga")
                .age(40)
                .address("Ammerpeth")
                .build();

    }
    @Bean
    public Student student() {
        return Student.builder()
                .name("silu")
                .age(23)
                .address("bsp")
                .build();
    }
}
