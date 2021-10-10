package com.additional;

public class RedPrinter extends Printer{
    public static final String ANSI_RED = "\u001B[31m";

    @Override
    void print(String value) {
        super.print(ANSI_RED+value);
    }
}
