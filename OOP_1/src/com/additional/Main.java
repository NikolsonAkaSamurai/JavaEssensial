package com.additional;

public class Main {

    public static void main(String[] args) {

        Address a1 = new Address();
        a1.setIndex(196105);
        a1.setCountry("USA");
        a1.setCity("New York");
        a1.setStreet("Broadway");
        a1.setHouse(15);
        a1.setApartments(48);

        a1.showAddress();
    }
}
