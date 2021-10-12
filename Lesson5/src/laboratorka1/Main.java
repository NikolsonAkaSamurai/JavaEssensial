package laboratorka1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();


            do{
                System.out.println("Выберите операцию (add, del, show)");
                String operation = inputOperation();
                switch(operation){
                    case "add":{
                        System.out.println("Впишите число для добавления");
                        nums.add(inputNum());
                        break;
                    }
                    case "del":{
                        System.out.println("Впишите что нужно удалить");
                        nums.remove((Integer) inputNum());
                        break;
                    }
                    case "show":{
                        System.out.println("Показываем весь лист");
                        System.out.println(nums.toString());
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
