package com.laboratorka1;

public class Cat extends Pet{

    @Override
    public void sound(){
        System.out.println("myau");
    }

    @Override
    public void show(){
        System.out.println("Barsik");
    }

    @Override
    public void type(){
        System.out.println("cat");
    }
}
