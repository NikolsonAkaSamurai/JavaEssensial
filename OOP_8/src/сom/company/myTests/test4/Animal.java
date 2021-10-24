package сom.company.myTests.test4;

import java.util.Scanner;

public class Animal {
    private int age;

    public Animal(){}

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  void inputAge(){
        Scanner scn = new Scanner(System.in);
        setAge(scn.nextInt());
    }
}
