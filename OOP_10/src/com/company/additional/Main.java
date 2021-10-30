package com.company.additional;

public class Main {
    public static void main(String[] args) {
        int a = MyClass.factoryMethod(10);
        Cat cat = MyClass.factoryMethod(new Cat("bob",10));
    }
}
