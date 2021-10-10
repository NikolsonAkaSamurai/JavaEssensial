package com.laboratorka1v2;

public class Rectangle extends Figure{
    double b;
    Rectangle(double a, double b){
        super(a);
        this.b = b;
    }

    @Override
    public void area() {
        double s = a * b;
        System.out.println("Площадь равна "+s);
    }
}
