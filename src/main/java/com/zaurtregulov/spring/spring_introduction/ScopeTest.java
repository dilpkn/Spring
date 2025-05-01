package com.zaurtregulov.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog mydog = (Dog) context.getBean("dog", Dog.class);
        mydog.say();

        context.close();
    }
}
