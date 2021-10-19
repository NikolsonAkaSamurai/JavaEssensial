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
        return super.toString();
    }
}

public class Main {

    public static void main(String[] args) {
        Vehicles vehicles = Vehicles.DODGE;
        System.out.println(vehicles.price);
        System.out.println(vehicles.getColor());
        System.out.println(vehicles.toString());// не понял почему стринг серый
    }
}
