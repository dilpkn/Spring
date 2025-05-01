package com.zaurtregulov.spring.spring_introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


//@Component
@Scope("singleton")
public class Dog implements Pet {

//    @PostConstruct
//    private void init() {
//        System.out.println("Class Dog: init-method");
//    }
//    @PreDestroy
//    private void destroy() {
//        System.out.println("Class Dog: destroy-method");
//    }

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public  void say(){
        System.out.println("Bow-Wow");
    }
}
