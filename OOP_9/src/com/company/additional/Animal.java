package com.company.additional;

public class Animal {
    private String name;
    private int age;
    private boolean tail;

    Animal(){}

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Имя: " + getName() + ", возраст: " + getAge() + ", хвост: " + ((getTail())?"есть":"нету");
    }
}
