package com.zaurtregulov.spring.spring_introduction;

public class Dog implements Pet {

    protected void init() {
        System.out.println("Class Dog: init-method");
    }

    private void destroy() {
        System.out.println("Class Dog: destroy-method");
    }

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public  void say(){
        System.out.println("Bow-Wow");
    }
}
