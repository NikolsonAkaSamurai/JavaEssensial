package com.task3;

public class Player implements Playable, Recodable{

    @Override
    public void play() {
        System.out.println("play");
    }

    @Override
    public void pause() {
        System.out.println("pause");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public void record() {
        System.out.println("record");
    }
}
