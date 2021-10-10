package com.additional;

public class YellowPrinter extends Printer{

    public static final String ANSI_YELLOW = "\u001B[33m";

    @Override
    void print(String value) {
        super.print(ANSI_YELLOW+value);
    }
}
