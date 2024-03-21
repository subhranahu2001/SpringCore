package com.JavaConfig;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Test;
import org.springframework.stereotype.Component;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {

    private String name;
    private int age;
    private String address;

    public void m1() {
        System.out.println("Inside " + getClass().getSimpleName());
    }
}
