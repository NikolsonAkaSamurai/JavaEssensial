package com.task2;

public class BadPupil extends Pupil{

    @Override
    public void study(){
        System.out.println("Плохо учится");

    }

    @Override
    public void read(){
        System.out.println("Практические не читает");

    }

    @Override
    public void write(){
        System.out.println("Плохо ведет конспекты");

    }

    @Override
    public void relax(){
        System.out.println("Часто сидит в телефоне на уроке");

    }
}
