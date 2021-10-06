package com.task3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2005);
        Car car3 = new Car(2004, 215);
        Car car4 = new Car(2008,220,1300);
        Car car5 = new Car(2030,900,1270,"silver");

        Car[] cars = {car1,car2,car3,car4,car5};

        viewAllCars(cars);
    }

    static void viewCarInfo(Car car){
        System.out.println("год: "+car.getYear()+" скорость: "+car.getSpeed()+
                            " масса: "+car.getWeight()+" цвет: "+car.getColor());
    }

    static void viewAllCars(Car[] cars){
        for (int i = 0; i < cars.length; i++) {
            viewCarInfo(cars[i]);
        }
    }
}
