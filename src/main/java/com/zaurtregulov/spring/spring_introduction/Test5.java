package com.zaurtregulov.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog = (Dog) context.getBean("myPet", Dog.class);
        myDog.say();
        Dog yourDog = (Dog) context.getBean("myPet", Dog.class);
        myDog.say();
        context.close();
    }
}
