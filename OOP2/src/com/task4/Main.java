package com.task4;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2021);
        Car car3 = new Car(2020,180);
        Car car4 = new Car(2019,175,1300);
        Car car5 = new Car(2015,190,1290,"orange");

        Car[] cars = {car1, car2, car3, car4, car5};
        viewAllCars(cars);
    }

    //метод для просмотра одной машины
    public static void viewCarInfo(Car car){
        System.out.println("год: "+car.getYear()+" скорость: "+car.getSpeed()+
                " масса: "+car.getWeight()+" цвет: "+car.getColor());
    }

    //метод для просмотра массива всех машин
    public static void viewAllCars(Car[] cars){
        for (int i = 0; i < cars.length; i++) {
            viewCarInfo(cars[i]);
        }
    }
}
