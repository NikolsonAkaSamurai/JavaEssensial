package com.laboratorka2;

public class Fraction {

    static int counter;

    private int numerator;
    private int denominator;

    Fraction(){};

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

}
