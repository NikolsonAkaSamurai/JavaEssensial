package com.task2;

public class Main {
    public static void main(String[] args) {

        AbstractHandler[] documents = new AbstractHandler[3];
        documents[0] = new XMLHandler();
        documents[1] = new TXTHandler();
        documents[2] = new DOCHandler();

        for (int i = 0; i < documents.length; i++) {
            documents[i].open();
            documents[i].create();
            documents[i].change();
            documents[i].save();
            System.out.println(" ");
        }
    }
}
