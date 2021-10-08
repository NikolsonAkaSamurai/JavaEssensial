package com.task2;

public class ExcellentPupil extends Pupil{

    @Override
    public void study(){
        System.out.println("Отлично учится");

    }

    @Override
    public void read(){
        System.out.println("Очень много читает");

    }

    @Override
    public void write(){
        System.out.println("Любит вести конспекты");

    }

    @Override
    public void relax(){
        System.out.println("Редко отдыхает на уроке");

    }
}
