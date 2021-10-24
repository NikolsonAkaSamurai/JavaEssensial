package сom.company.myTests.test4;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        setAnimalAge(animal);


        System.out.println("Возраст животного " + animal.getAge());
    }

    public static void setAnimalAge(Animal animal){
        while (true){
            System.out.println("вписать возраст");
            try{
                animal.inputAge();
                break;
            }catch (InputMismatchException e){
                System.out.println("нужно писать цифрами");
            }
        }
    }
}
