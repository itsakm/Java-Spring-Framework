package com.akm.spring;

public interface Computer {

    public default void compile()
    {
        System.out.println("Compiling from Computer!!!");
    }
}
