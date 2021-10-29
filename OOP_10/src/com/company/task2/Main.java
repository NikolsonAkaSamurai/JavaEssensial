package com.company.task2;


public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(35);
        System.out.println(myList.toString());

        MyList<String> myList2 = new MyList<>();
        myList2.add("Вася");
        myList2.add("Степа");
        myList2.add("Петя");
        myList2.add("Олег");
        myList2.add("Антон");
        myList2.add("Аркадий");
        myList2.add("Леонид");
        myList2.add("Иван");
        myList2.add("Сергей");
        myList2.add("Александр");
        System.out.println(myList2.toString());

        //получаем Аркадия по индексу 5
        System.out.println(myList2.get(5));

        //количество заполненных элементов в списке
        System.out.println(myList2.getNumsAllElements());

    }
}
