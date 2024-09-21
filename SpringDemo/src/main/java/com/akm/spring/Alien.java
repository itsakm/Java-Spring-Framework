package com.akm.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {


    int age;

    @Autowired
    @Qualifier("com2")
    Computer com;

    public Alien()
    {
        System.out.println("Alien Object Created!!");
    }

    public Alien(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
//        System.out.println("Setter called!!");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }


    public void setCom(Computer com) {
        this.com = com;
    }

    public void code()
    {
        System.out.println("Coding!");
        com.compile();
    }
}
