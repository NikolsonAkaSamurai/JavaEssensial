package task3;
import task2.Zoo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        ArrayList<String> animals = zoo.getAnimals();
        animals.remove(7);
        animals.remove(5);
        animals.remove(3);
        System.out.println("Размер листа " + animals.size());
        System.out.println(animals.toString());

    }
}
