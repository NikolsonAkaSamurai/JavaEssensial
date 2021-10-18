package com.company.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Distance chineseWall = new Distance(21_196);
        chineseWall.print();

        Distance someWay = new Distance(inputKilometers());
        someWay.print();
    }

    public static double inputKilometers(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите дистанцию в километрах: ");
        double kilometers = scn.nextDouble();
        return kilometers;
    }
}
