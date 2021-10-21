package сom.company.laboratorka1;
/*
Задание
Создайте свой класс исключения для проверки выгула животного.
Программа должна содержать несколько методов, проверяющий экипировку
животного (например: ошейник, поводок и тд.) и
результирующий метод «выгул». Если одно из требований хотя бы не выполнено,
то выбросить свое исключение или же отработать нормально
 */

 class Error extends Exception{
     public void method(){
         System.out.println("ошибка!");
     }

}


public class Main {
    public static void main(String[] args) throws Error {
        Dog dog = new Dog(true,true,false);
        dog.walking();
    }


}
class Dog{
    private boolean collar;
    private boolean leash;
    private boolean toy;

    Dog(boolean collar, boolean leash, boolean toy){
        this.collar = collar;
        this.leash = leash;
        this.toy = toy;
    }

    public void walking() throws Error{
        if(collar == true && leash == true && toy == true){
            System.out.println("можно гулять");
        }else{
            throw new Error();
        }
    }
}
