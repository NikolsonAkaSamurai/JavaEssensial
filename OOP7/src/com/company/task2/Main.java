package com.company.task2;

public class Main {
    public static void main(String[] args) {
        Animals[] animal = new Animals[3];
        
        animal[0] = Animals.DOG;
        animal[1] = Animals.CAT;
        animal[2] = Animals.BIRD;

        for (Animals temp: animal) {
            System.out.println(temp.toString());
        }


    }
}
