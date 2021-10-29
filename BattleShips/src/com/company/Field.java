package com.company;

import java.util.Scanner;

public class Field {
    protected static final char blockChar = '\u25A0';
    protected static final char waterChar = '\u25A1';
//    protected static final char crushBlockChar = '\u25A3';
    protected static final char crushBlockChar = '\u2612';

    protected static final String water = " " + waterChar + " ";
    protected static final String block = " " + blockChar + " ";
    protected static final String crushBlock = " " + crushBlockChar + " ";

    String[][] field = new String[10][10];

    Field(){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = water;
            }
        }
    }

    public String[][] getField(){
        return this.field;
    }

    public void viewField(){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println("");
        }
    }

    public void createBlock(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Укажите по вертикали");
        int y = scn.nextInt();
        System.out.println("теперь по горизонтали");
        int x = scn.nextInt();
        this.field[y-1][x-1] = block;
    }

    public void createCrushBlock(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Укажите по вертикали");
        int y = scn.nextInt();
        System.out.println("теперь по горизонтали");
        int x = scn.nextInt();
        this.field[y-1][x-1] = crushBlock;
    }
}
