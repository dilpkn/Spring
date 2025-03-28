package com.zaurtregulov.spring.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

    private Pet pet;
    private String surname;
    private int age;

    @Autowired
    public Person(Pet  pet) {
        this.pet = pet;
        System.out.println("person bean is created");
    }


    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Age set");
        this.age = age;
    }

    public void setSurname(String surname) {
        System.out.println("surname set");
        this.surname = surname;
    }


//    public Person() {
//        System.out.println("person bean is created");
//    }

    public void setPet(Pet pet) {
        System.out.println("class Person: set pet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("hello, my lovely pet!");
        pet.say();
    }
}
