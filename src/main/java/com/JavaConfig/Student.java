package com.JavaConfig;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

//    @Value("silu")
    private String name;
//    @Value("13")
    private int age;
//    @Value("bbsr")
    private String address;

    @Autowired
    private Teacher teacher;

}
