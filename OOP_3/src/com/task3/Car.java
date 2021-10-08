package com.task3;

public class Car extends Vehicle{

    Car(int coordinates, int price, int speed, int productionYear){
        super(coordinates, price, speed, productionYear);

    }

    @Override
    void viewInfo(){
        System.out.println("Координаты "+coordinates+ " цена "+price+" скорость "+speed+" год "+productionYear);
    }
}
