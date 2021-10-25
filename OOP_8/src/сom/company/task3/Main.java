package сom.company.task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Price[] prices = new Price[2];
        for (int i = 0; i < prices.length; i++) {
            System.out.println("\u001B[36m" + "введите название товара");
            String name = scn.next();
            System.out.println("\u001B[36m" + "введите название магазина");
            String shop = scn.next();
            System.out.println("\u001B[36m" + "введите цену товара");
            int money = scn.nextInt();
            prices[i] = new Price(name,shop,money);
        }

        Arrays.sort(prices, new Comparator<Price>(){
            @Override
            public int compare(Price p1, Price p2){
                return p1.getShop().compareTo(p2.getShop());
            }
        });

        System.out.println("\u001B[36m" + "товары какого магазина ищем ?");
        String searchShop = scn.next();
        boolean searchingResult = false;

        for (Price temp: prices) {
            if (temp.getShop().equals(searchShop)){
                System.out.println("\u001B[33m" + temp.toString());
                searchingResult = true;
            }
        }

        try{
            if(searchingResult == false){
                throw new Exception();
            }
        }catch (Exception e){

            System.out.println("\u001B[31m" + "Такого магазина нету в списке");
        }finally {
            System.out.println("\u001B[32m" + "Поиск завершен");
        }
    }
}
