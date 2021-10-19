package com.company.laboratorka1;

public class Main {

    public static void main(String[] args) {
        Book book = new Book();
        Magazine magazine = new Magazine();
        Printable newspaper = new Printable() {
            @Override
            public void print() {
                System.out.println("Newspaper");
            }
        };
        
        Printable[] products = {book, magazine, newspaper};

        for (Printable temp:products) {
            temp.print();
        }


    }
}
