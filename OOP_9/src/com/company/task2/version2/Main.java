package com.company.task2.version2;

public class Main {
    public static void main(String[] args) {
        Device device1 = new Device("Dell", 41850,"DL100600");
        System.out.println(device1.toString());

//        Device.Monitor monitor = device.new Monitor(100,100,800,"AB50FG40");
//        System.out.println(monitor.toString());

        Device device2 = Device.copyDevice(device1);
        System.out.println("device2 = device is "+device2.equals(device1));
    }
}
