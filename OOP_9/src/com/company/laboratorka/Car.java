package com.company.laboratorka;

public class Car {

    public static int COUNTER ;
    private int id, year, price, regNum;
    private String mark, model, color;

    Car(){}

    public Car( int year, int price, int regNum, String mark, String model, String color) {
        COUNTER++;
        this.id = COUNTER;
        this.year = year;
        this.price = price;
        this.regNum = regNum;
        this.mark = mark;
        this.model = model;
        this.color = color;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "id "+id+" mark "+mark+" model "+model+ " год "+year+" цвет "+color+" цена "+price+" регНом "+regNum;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRegNum() {
        return regNum;
    }

    public void setRegNum(int regNum) {
        this.regNum = regNum;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



}
