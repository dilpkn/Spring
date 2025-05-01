package com.zaurtregulov.spring.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

//    @Autowired
//    public Person(@Qualifier("catBean") Pet  pet) {
//        this.pet = pet;
//        System.out.println("person bean is created");
//    }

    public Person (Pet  pet) {
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


    public Person() {
        System.out.println("person bean is created");
    }

    // @Autowired
    public void setPet(Pet pet) {
        System.out.println("class Person: set pet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("hello, my lovely pet!");
        pet.say();
    }
}
