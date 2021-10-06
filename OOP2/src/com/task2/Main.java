package com.task2;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setYear(2005);
        car1.setColor("green");
        System.out.println("год: "+car1.getYear()+" цвет: "+car1.getColor()+"\n");

        Car car2 = new Car(2007);
        car2.setColor("red");
        System.out.println("год: "+car2.getYear()+" цвет: "+car2.getColor()+"\n");

        Car car3 = new Car(2020, "black");
        System.out.println("год: "+car3.getYear()+" цвет: "+car3.getColor()+"\n");


    }
}
