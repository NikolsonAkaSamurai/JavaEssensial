package com.company.laboratorka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final  int THIS_YEAR = 2021;//нынешний год для подсчета пробега машины


        Car[] cars = new Car[4];
        cars[0] = new Car(2021,10000,1234,"Chevrolet","Camara","yellow");
        cars[1] = new Car(2020,9000,1235,"Mitsubishi","Lancer","gray");
        cars[2] = new Car(2019,8000,1236,"Volkswagen","Polo","white");
        cars[3] = new Car(2021,10000,1234,"Chevrolet","Camara","yellow");
        boolean loop = true;

        while (loop){

            Scanner scn = new Scanner(System.in);
            System.out.println( "a) список марок автомобилей из созданного массива объектов\n"+
                                "b) список автомобилей, которые эксплуатируются больше n лет\n"+
                                "c) список автомобилей заданного года выпуска, цена которых больше указанной\n"+
                                "d) количество одинаковых автомобилей сравнивая с первым автомобилем\n"+
                                "exit - выйти из программы" );

            System.out.println("Впишите команду");
            String change = scn.next();
            switch (change){
                case "a":{
                    for (Car temp:cars) {
                        System.out.println("Марка "+temp.getMark());
                    }
                    break;
                }
                case "b":{
                    System.out.println("какой пробег автомобиля?");
                    int probeg = scn.nextInt();
                    for (Car temp:cars) {
                        if(THIS_YEAR - temp.getYear() > probeg) {
                            System.out.println(temp.toString());
                        }
                    }
                    break;
                }
                case "c":{
                    System.out.println("Введите год автомобиля:");
                    int year = scn.nextInt();
                    System.out.println("Введите минимальную цену автомобиля");
                    int price = scn.nextInt();
                    for (Car temp:cars) {
                        if(year == temp.getYear() && price < temp.getPrice()){
                            System.out.println(temp.toString());
                        }
                    }
                    break;
                }
                case "d":{
                    Car firstCar = cars[0];
                    int counter = -1;
                    for (Car temp:cars) {
                        if(firstCar.equals(temp) && firstCar.hashCode() == temp.hashCode()){
                            counter++;
                            System.out.println(temp.toString());
                        }
                    }
                    System.out.println("Автомобилей похожих на первый : "+counter);
                    break;
                }
                case "exit":{
                    loop = false;
                    break;
                }
            }
            System.out.println("---------------------------------------");
        }


    }
}
