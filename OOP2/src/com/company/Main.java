package com.company;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setFirstName("Anton");
        s1.setSecondName("Pavlov");

        System.out.println("Имя: " + s1.getFirstName() + " Фамилия:" + s1.getSecondName() + " Номер в журнале " + Student.counter);

        Student s2 = new Student("Vasilyi", "Lebedev");
        System.out.println("Имя: " + s2.getFirstName() + " Фамилия:" + s2.getSecondName() + " Номер в журнале " + Student.counter);
    }
}
