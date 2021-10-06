package com.additional1;

public class Main {
    public static void main(String[] args) {
        MyArea circle = new MyArea(15);
        System.out.println("площадь круга равна: "+MyArea.areaOfCircle(circle.getRadius()));
    }
}
