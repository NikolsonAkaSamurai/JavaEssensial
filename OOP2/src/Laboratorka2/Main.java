package Laboratorka2;

public class Main {

    public static void main(String[] args) {

    Fraction a = new Fraction(5,10);

    Fraction b = new Fraction(5,12);

    Fraction c = new Fraction();
    c = mult(a,b);

    showFraction(c);


    }

    static Fraction mult(Fraction a, Fraction b){


      int numerator = a.getNumerator() * b.getNumerator();

      int denominator = a.getDenominator() * b.getDenominator();

        Fraction result = new Fraction(numerator,denominator);

        return result;
    }

    static void showFraction(Fraction fraction){
        System.out.println(fraction.getNumerator()+"/"+fraction.getDenominator());
    }
}
