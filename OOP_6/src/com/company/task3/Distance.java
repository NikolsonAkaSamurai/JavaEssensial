package com.company.task3;

public class Distance {
    private double distance;

    Distance(){}

    Distance(double distance){
        this.distance = distance;
    }

    public void print(){
        String msg = "Дистанация в милях: ";
        System.out.println(msg + Converter.convertToMiles(this.distance));
    }

    public double getDistance(){
        return distance;
    }

    static class Converter{

        static double convertToMiles(double distance){
            double miles = distance * 0.621371;
            return miles;
        }
    }
}
