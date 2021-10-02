package com.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //создаем экземпляр класса Rectangle
        Rectangle a = new Rectangle();

        //забиваем через сеттер первую сторону
        System.out.println("Введите длину первой стороны:");
        a.setSide1(setNum());

        //забиваем через сеттер вторую сторону
        System.out.println("Введите длину второй стороны:");
        a.setSide2(setNum());

        //выводим через методы класса Rectangle результаты
        System.out.println("Площадь прямоугольника "+a.areaCalculator());
        System.out.println("Периметр прямоугольника "+a.perimeterCalculator());
    }

    //статический метод класса Main для удобного ввода чисел
    static public double setNum(){
        Scanner scn = new Scanner(System.in);
        double num = scn.nextDouble();
        return num;
    }
}
