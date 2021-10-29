package com.company;

import java.util.Scanner;

public class Player extends Field{
    private String name;
    private int number;
    private static final String greetingsMessage = "Добро пожаловать в игру морской бой!";
    private static int COUNTER = 0;

    Player(){
        COUNTER++;
        number = COUNTER;
    }

    public void setName(String name){
        this.name = name;
    }

    static {
        System.out.println(greetingsMessage);
    }

    public void inputName(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Игрок " + number + " введите свое имя");
        setName(scn.next());
    }

    @Override
    public void viewField() {
        System.out.println("------" + this.name + "------");
        super.viewField();
    }

}
