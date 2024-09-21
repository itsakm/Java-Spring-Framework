package com.akm.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("com2")
public class Desktop implements Computer {

    public Desktop()
    {
        System.out.println("Desktop Object created!! ");
    }

    @Override
    public void compile()
    {
        System.out.println("Compiling from Desktop!!");
    }
}
