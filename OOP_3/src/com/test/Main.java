package com.test;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int endurance = rnd.nextInt(45)+45;
        int gumption = rnd.nextInt(4)+1;
        int writeEndurance = rnd.nextInt(5)+2;

        System.out.println(writeEndurance);
    }
}
