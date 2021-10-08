package com.task3;

public class Vehicle {
    protected int coordinates;
    protected int price;
    protected int speed;
    protected int productionYear;

    Vehicle(int coordinates, int price, int speed, int productionYear){
        this.coordinates = coordinates;
        this.price = price;
        this.speed = speed;
        this.productionYear = productionYear;
    }

    void viewInfo(){}
}
