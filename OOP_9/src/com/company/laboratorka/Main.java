package com.company.laboratorka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final  int THIS_YEAR = 2021;

        Car[] cars = new Car[3];
        cars[0] = new Car(2021,10000,1234,"Chevrolet","Camara","yellow");
        cars[1] = new Car(2020,9000,1235,"Mitsubishi","Lancer","gray");
        cars[2] = new Car(2019,8000,1236,"Volkswagen","Polo","white");

        while (true){
            Scanner scn = new Scanner(System.in);
            System.out.println( "a) список марок автомобилей из созданного массива объектов;"+
                                "b) список автомобилей, которые эксплуатируются больше n лет;"+
                                "c) список автомобилей заданного года выпуска, цена которых больше указанной."+
                                "d) количество одинаковых автомобилей сравнивая с первым автомобилем );");
            String change = scn.next();
            switch (change){
                case "a":{
                    for (Car temp:cars) {
                        System.out.println("Марка "+temp.getMark());
                    }
                }
                case "b":{
                    System.out.println("какой пробег автомобиля?");
                    int probeg = scn.nextInt();
                    for (Car temp:cars) {
                        if(THIS_YEAR - temp.getYear() > probeg) {
                            System.out.println(temp.toString());
                        }
                    }
                }
                case "c":{
                    System.out.println("укажите цену");
                    int price = scn.nextInt();

                }
                case "d":{

                }
            }
        }


    }
}
