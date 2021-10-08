package com.task3;

public class Ship extends Vehicle{
    private int numPessengers;
    private String port;

    Ship(int coordinates, int price, int speed, int productionYear, int numPessengers, String port){
        super(coordinates, price, speed, productionYear);
        this.numPessengers = numPessengers;
        this.port = port;
    }

    @Override
    void viewInfo(){
        System.out.println("Координаты "+coordinates+ " цена "+price+" скорость "+speed+" год "+productionYear+
                " порт "+port+" пассажиры "+numPessengers);
    }
}
