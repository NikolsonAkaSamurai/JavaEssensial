package com.additional1;

public class MyArea {
    private static final double PI = 3.14;
    private double radius;

    MyArea(double radius){
        this.radius = radius;
    }

    static double areaOfCircle(double radius){
        double s = PI*Math.pow(radius,2);
        return s;
    }

    public double getRadius() {
        return radius;
    }
}
