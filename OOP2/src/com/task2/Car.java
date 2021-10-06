package com.task2;

public class Car {

    //поля класса
    private int year;
    private String color;

    //конструкторы
    Car(){
        System.out.println("Вызов конструктора без параметров");
    }

    Car(int year){
        System.out.println("Вызов конструктора с одним параметром");
        this.year = year;
    }

    Car(int year, String color){
        System.out.println("Вызов конструктора с двумя параметрами");
        this.year = year;
        this.color = color;
    }

    //геттеры и сеттеры
    void setYear(int year){
        this.year = year;
    }

    int getYear(){
        return year;
    }

    void setColor(String color){
        this.color = color;
    }

    String getColor(){
        return color;
    }
}
