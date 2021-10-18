package com.company.task2;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.print();

        Vehicle.Door door = vehicle.new Door();
        door.print();

        Vehicle.Wheel wheel = vehicle.new Wheel();
        wheel.print();
    }
}
