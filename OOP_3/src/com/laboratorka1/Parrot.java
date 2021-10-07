package com.laboratorka1;

public class Parrot extends Pet{

    @Override
    public void sound(){
        System.out.println("Kurlyk");
    }

    @Override
    public void show(){
        System.out.println("Pirat");
    }

    @Override
    public void type(){
        System.out.println("Bird");
    }
}
