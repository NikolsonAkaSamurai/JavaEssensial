package com.company.task3;

public class Main {
    public static void main(String[] args) {
        MyDictionary<Integer, String> myDictionary = new MyDictionary<>();
        myDictionary.add(1020, "Артем");
        myDictionary.add(4444, "Виктор");
        myDictionary.add(6666, "Игорь");

        //получение всего содержимого списка
        System.out.println(myDictionary.toString());

        //получение Key по индксу 1
        System.out.println(myDictionary.getKey(1));

        //получение Value по индекс 2
        System.out.println(myDictionary.getValue(2));
    }
}
