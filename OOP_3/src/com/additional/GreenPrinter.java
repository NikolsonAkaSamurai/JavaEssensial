package com.additional;

public class GreenPrinter extends Printer{
    public static final String ANSI_GREEN = "\u001B[32m";

    @Override
    void print(String value) {
        super.print(ANSI_GREEN+value);
    }
}
