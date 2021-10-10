package com.task2;

public class BadPupil extends Pupil{
    @Override
    public void study() {
        System.out.println("I don't like study");

    }

    @Override
    public void write() {
        System.out.println("I don't like write");

    }

    @Override
    public void read() {
        System.out.println("I don't like read");

    }

    @Override
    public void relax() {
        System.out.println("I  like relax");

    }
}
