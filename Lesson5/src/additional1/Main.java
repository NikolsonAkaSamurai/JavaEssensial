package additional1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("Генадий Свердлов");
        teachers.add("Татьяна Баринова");
        teachers.add("Наталья Шпадарева");
        teachers.add("Best Teacher");
        teachers.add("Bad Teacher");

        System.out.println("Индекс лучшего учителя");
        System.out.println(teachers.indexOf("Best Teacher"));
        System.out.println("Индекс худшего учителя");
        System.out.println(teachers.indexOf("Bad Teacher"));
        System.out.println(teachers.toString());

    }


}
