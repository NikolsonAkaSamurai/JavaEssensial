package com.laboratorka1;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.sound();
        dog.show();
        dog.type();
        System.out.println("");

        Cat cat = new Cat();
        cat.sound();
        cat.show();
        cat.type();
        System.out.println("");


        Parrot parrot = new Parrot();
        parrot.sound();
        parrot.show();
        parrot.type();
        System.out.println("");


        Hamster hamster = new Hamster();
        hamster.sound();
        hamster.show();
        hamster.type();
    }
}
