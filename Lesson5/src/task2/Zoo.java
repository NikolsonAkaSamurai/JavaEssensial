package task2;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<String> animals;

    public Zoo(){
        animals = new ArrayList<>();
        animals.add("Bird");
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Beetle");
        animals.add("Bat");
        animals.add("dolphin");
    }

    public  void showAnimals(){
        System.out.println(animals.toString());
    }

    public ArrayList<String> getAnimals(){
        return animals;
    }
}
