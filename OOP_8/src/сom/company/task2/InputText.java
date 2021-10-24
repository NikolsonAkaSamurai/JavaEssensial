package сom.company.task2;

import java.util.Scanner;

public class InputText {

        public static String inputString(){
            Scanner scn = new Scanner(System.in);
            return scn.next();
        }

        public static int inputInt(){
            int a;
            while (true){
                try{
                    Scanner scn = new Scanner(System.in);
                    a = scn.nextInt();
                    break;
                }catch (Exception e){
                    System.out.println("вы вписали не цифру!");
                }
            }
            return a;
        }
}
