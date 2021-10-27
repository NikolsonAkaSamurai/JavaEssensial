package com.company.laboratorka;

public class Car {
    //поля
    public static int COUNTER ;
    private int id, year, price, regNum;
    private String mark, model, color;

    //конструкторы
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

    //переопределенные методы Object
    @Override
    public int hashCode() {
        int result = 17;
        final int prime = 37;

        result = prime * result + ((mark == null)? 0: mark.hashCode());
        result = prime * result + ((model == null)? 0: model.hashCode());
        result = prime * result + ((color == null)? 0: color.hashCode());
        result = prime * result + year;
        result = prime * result + price;
        result = prime * result + regNum;

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        Car c2 = (Car) obj;
        return (this.mark.equals(c2.getMark()) &&
                this.model.equals(c2.getModel()) &&
                this.color.equals(c2.getColor()) &&
                this.year == c2.year &&
                this.price == c2.price &&
                this.regNum == c2.regNum)?true:false;
    }

    @Override
    public String toString() {
        return "id "+id+" mark "+mark+" model "+model+ " год "+year+" цвет "+color+" цена "+price+" регНом "+regNum;
    }

    //гетеры и сетеры
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
