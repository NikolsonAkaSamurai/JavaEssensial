package com.laboratorka1;

public class Hamster extends Pet{

    @Override
    public void sound() {
        System.out.println("vjuh");
    }

    @Override
    public void show(){
        System.out.println("Pushistik");
    }

    @Override
    public void type(){
        System.out.println("hamster");
    }
}
