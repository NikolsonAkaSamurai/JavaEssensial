package com.company.task2;

public enum Animals {
    DOG(5), CAT(6), BIRD(3);
    private int age;

    Animals(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Живнотное - "+super.toString() + " возраст - "+ getAge();
    }
}
