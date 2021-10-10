package com.laboratorka1v2;

public class Trapezoid extends Figure{
    double b;
    double h;

    Trapezoid(double a, double b, double h){
        super(a);
        this.b = b;
        this.h = h;
    }

    @Override
    public void area(){
        double s = ((a + b) / 2) * h;
        System.out.println("Площадь равна "+s);
    }
}
