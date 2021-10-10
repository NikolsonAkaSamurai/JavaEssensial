package com.additional;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Printer[] printers = new Printer[3];
        printers[0] = new RedPrinter();
        printers[1] = new GreenPrinter();
        printers[2] = new YellowPrinter();

        String text = input();

        for (int i = 0; i < printers.length; i++) {
            printers[i].print(text);
        }
    }

    public static String input(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите вашу строчку");
        String p = scn.nextLine();
        return p;
    }
}
