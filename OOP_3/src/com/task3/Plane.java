package com.task3;

public class Plane  extends Vehicle{
    private int height;
    private int numPessengers;

    Plane(int coordinates, int price, int speed, int productionYear, int height, int numPessengers){
        super(coordinates, price, speed, productionYear);
        this.height = height;
        this.numPessengers = numPessengers;
    }

    @Override
    void viewInfo(){
        System.out.println("Координаты "+coordinates+ " цена "+price+" скорость "+speed+" год "+productionYear+
                " высота "+height+" пассажиры "+numPessengers);
    }
}
