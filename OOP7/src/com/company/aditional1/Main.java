package com.company.aditional1;

enum Vehicles{
    FERRARI(1000000){
        @Override
        public String getColor() {
            return "Red";
        }
    }, DODGE(50000){
        @Override
        public String getColor() {
            return "Green";
        }
    }, CHEVROLET(40000){
        @Override
        public String getColor() {
            return "Black";
        }
    };
    int price;

    abstract public String getColor();


    Vehicles(int price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name: " + super.toString() + ", color = " + getColor() + ", price= " + this.price;
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println(Vehicles.FERRARI.toString());
        System.out.println(Vehicles.DODGE.toString());
        System.out.println(Vehicles.CHEVROLET.toString());

    }
}
