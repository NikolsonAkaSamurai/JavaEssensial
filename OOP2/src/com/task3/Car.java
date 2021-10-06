package com.task3;

public class Car {

    //поля класса
    private int year;
    private double speed;
    private int weight;
    private String color;

    //конструкторы
    Car(){}

    Car(int year){
        this.year = year;
    }

    Car(int year, double speed){
        this(year);
        this.speed = speed;
    }

    Car(int year, double speed, int weight){
        this(year, speed);
        this.weight = weight;
    }

    Car(int year, double speed, int weight, String color){
        this(year, speed, weight);
        this.color = color;
    }

    //геттеры и сеттеры
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
