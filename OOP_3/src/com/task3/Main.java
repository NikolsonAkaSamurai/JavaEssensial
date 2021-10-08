package com.task3;

public class Main {
    public static void main(String[] args) {
        Vehicle p = new Plane(250,150,900,2010,10,275);
        Vehicle s = new Ship(260,100,45,2000,500,"New-York");
        Vehicle c = new Car(300,50,60,2015);

        p.viewInfo();
        s.viewInfo();
        c.viewInfo();
    }
}
