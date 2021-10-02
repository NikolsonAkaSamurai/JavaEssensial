package com.task2;

public class Rectangle {
    //поля класса
    private double side1, side2;

    //метод вычисляющий площадь
    public double areaCalculator(){
        double area = side1 * side2;
        return area;
    }

    //метод вычисляющий периметр
    public double perimeterCalculator(){
        double perimeter = (side1 + side2) * 2;
        return perimeter;
    }

    //гетер и сетер первой стороны
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    //гетер и сетер второй стороны
    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }
}
