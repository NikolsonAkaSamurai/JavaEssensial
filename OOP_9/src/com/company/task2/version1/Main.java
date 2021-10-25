package com.company.task2.version1;
import  static com.company.task2.version1.Device.*;
import  static com.company.task2.version1.Monitor.*;
public class Main {
    public static void main(String[] args) {
        Device device1 = new Device("Dell", 41850,"DL100600");
        System.out.println(device1.toString());

        Monitor monitor1 = new Monitor(device1,100,100,800,"AB50FG40");
        System.out.println(monitor1.toString());

        Device device2 = copyDevice(device1);
        System.out.println("Equality of devices: " + device1.equals(device2));
        Device device3 = new Device("HP", 16000,"HP4050");
        System.out.println("Equality of devices: " + device3.equals(device2));



        Monitor monitor2 = copyMonitor(monitor1);
        System.out.println("Equality of monitors: " + monitor1.equals(monitor2));
    }
}
