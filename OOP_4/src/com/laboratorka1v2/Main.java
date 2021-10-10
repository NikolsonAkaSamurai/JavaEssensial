package com.laboratorka1v2;

public class Main {
    public static void main(String[] args) {

        Figure[] figures = new Figure[3];
        figures[0] = new Rectangle(40,40);
        figures[1] = new Circle(20);
        figures[2] = new Trapezoid(100,80,40);

        for (int i = 0; i < figures.length; i++) {
            figures[i].area();
        }
    }
}
