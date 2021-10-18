package com.company.additional1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> nums = new ArrayList<>();
        nums.add(Calculator.summ(1,2));
        nums.add(Calculator.subt(10,5));
        nums.add(Calculator.mult(3,4));
        nums.add(Calculator.div(20,5));
        System.out.println(nums.toString());

    }

    static class Calculator{
        public static double summ(double a, double b){
            double result = a + b;
            return result;
        }

        public static double subt(double a, double b){
            double result = a - b;
            return result;
        }

        public static double mult(double a, double b){
            double result = a * b;
            return result;
        }

        public static double div(double a, double b){
            double result = a / b;
            return result;
        }
    }
}
