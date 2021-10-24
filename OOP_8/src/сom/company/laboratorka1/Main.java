package сom.company.laboratorka1;
/*
Задание
Создайте свой класс исключения для проверки выгула животного.
Программа должна содержать несколько методов, проверяющий экипировку
животного (например: ошейник, поводок и тд.) и
результирующий метод «выгул». Если одно из требований хотя бы не выполнено,
то выбросить свое исключение или же отработать нормально
 */

 class ExceptionDog extends Exception{

     ExceptionDog(String message){
         super(message);
     }
}

public class Main {
    public static void main(String[] args){
        Dog dog = new Dog(true,true,true);
        dog.checkDog();
        Dog dog2 = new Dog(false,true,true);
        dog2.checkDog();
    }


}
class Dog{
    private boolean collar, leash, toy;

    Dog(boolean collar, boolean leash, boolean toy){
        this.collar = collar;
        this.leash = leash;
        this.toy = toy;
    }



    public void checkDog(){

        try{

            if(!collar || !leash || !toy){
                throw new ExceptionDog(" Вы забыли какую то вещь!");
            }else{
                System.out.println("Можно выходить на прогулку!");
            }

        }catch (ExceptionDog e){
            System.out.println(e.getMessage());
        }



    }
}
