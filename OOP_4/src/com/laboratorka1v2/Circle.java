package com.laboratorka1v2;

public class Circle extends Figure{

    static final double PI = 3.14;

    Circle(double a){
        super(a);
    }

    @Override
    public void area() {
        double s = PI * Math.pow(a,2);
        System.out.println("Площадь равна "+s);
    }
}
