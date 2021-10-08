package com.task2;

public class GoodPupil extends Pupil{

    @Override
    public void study(){
        System.out.println("Хорошо учится");

    }

    @Override
    public void read(){
        System.out.println("Любит читать");

    }

    @Override
    public void write(){
        System.out.println("Старается вести все конспекты");

    }

    @Override
    public void relax(){
        System.out.println("Любит иногда посидеть в телефоне на уроке");

    }
}
