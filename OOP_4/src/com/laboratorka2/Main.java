package com.laboratorka2;

public class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[2];
        printables[0] = new Book();
        printables[1] = new Magazine();

        for (int i = 0; i < printables.length; i++) {
            printables[i].print();
        }
    }
}
