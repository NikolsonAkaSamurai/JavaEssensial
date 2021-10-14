package laboratorka1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();


            do{
                System.out.println("1. Добавить элемент в список;\n" +
                        "    2. Удалить элемент из списка;\n" +
                        "    3. Показать содержимое списка;\n" +
                        "    4. Проверить есть ли значение в списке;\n" +
                        "    5. Заменить значение в списке.");
                String operation = inputOperation();
                switch(operation){
                    case "1":{
                        System.out.println("Впишите число для добавления");
                        nums.add(inputNum());
                        break;
                    }
                    case "2":{
                        System.out.println("Впишите что нужно удалить");
                        nums.remove((Integer) inputNum());
                        break;
                    }
                    case "3":{
                        System.out.println("Показываем весь лист");
                        System.out.println(nums.toString());
                        break;
                    }
                    case "4":{
                        System.out.println("Какой элемент ищем ?");
                        int num = inputNum();
                        if(nums.contains(num) == true){
                            System.out.println("Такое элемент есть");
                        }else{
                            System.out.println("такого элемента нету в списке");
                        }
                        break;
                    }
                    case "5":{
                        System.out.println("Укажите индекс");
                        int index = inputNum();
                        System.out.println("укажите новое число");
                        int otherNum = inputNum();
                        nums.set(index, otherNum);
                        break;
                    }
                }
            }

            while (change().equals("y"));





    }

    public static int inputNum(){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        return a;
    }

    public static String inputOperation(){
        Scanner scn = new Scanner(System.in);
        String operation = scn.nextLine();
        return operation;
    }

    public static String change(){
        System.out.println("хотите продолжить ? (y / n)");
        Scanner scn = new Scanner(System.in);
        String change = scn.next();
        return change;
    }
}
