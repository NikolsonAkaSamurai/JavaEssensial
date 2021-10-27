package com.company.task2.version1;
import  static com.company.task2.version1.Device.*;
import  static com.company.task2.version1.Monitor.*;
public class Main {
    public static void main(String[] args) {
        Device device1 = new Device("Dell", 41850,"DL100600");
        Device device2 = copyDevice(device1);
        Device device3 = new Device("HP", 16000,"HP4050");

        System.out.println("Вывод данных device1: " + device1.toString());
        System.out.println("device1 сравниваем с device2: " + device1.equals(device2));
        System.out.println("device1 сравниваем с device3: " + device1.equals(device3));
        System.out.println("хеш код device1: " + device1.hashCode());
        System.out.println("хеш код device2: " + device2.hashCode());
        System.out.println("хеш код device3: " + device3.hashCode()+"\n");



        Monitor monitor1 = new Monitor(device1,100,100,800,"AB50FG40");
        Monitor monitor2 = copyMonitor(monitor1);
        Monitor monitor3 = new Monitor(device1,150,130,650,"ВС30FG70");
        System.out.println("Вывод данных monitor1: " + monitor1.toString());
        System.out.println("monitor1 сравниваем с monitor2: " + monitor1.equals(monitor2));
        System.out.println("monitor1 сравниваем с monitor3: " + monitor1.equals(monitor3));
        System.out.println("хеш код monitor1: " + monitor1.hashCode());
        System.out.println("хеш код monitor2: " + monitor2.hashCode());
        System.out.println("хеш код monitor3: " + monitor3.hashCode()+"\n");
    }
}
