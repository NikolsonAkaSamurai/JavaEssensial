package com.laboratorka1;

public class Dog extends Pet{

    @Override
    public void sound(){
        System.out.println("gaf");
    }

    @Override
    public void show(){
        System.out.println("Tuzik");
    }

    @Override
    public void type(){
        System.out.println("dog");
    }
}
