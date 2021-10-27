package com.company.additional;

public class Main {

    public static void main(String[] args) {
        Animal cat1 = new Animal("Васька", 5, true);
        Animal cat2 = new Animal("Цезарь", 4,true);
        Animal cat3 = new Animal("Боб", 10,false);

        System.out.println(cat1.toString());
        System.out.println(cat2.toString());
        System.out.println(cat3.toString());
    }
}
