package com.company.laboratorka;

public class MyClass <T>{

    private T variable;

    MyClass(T variable){
        this.variable = variable;
    }

    public void show(){
        System.out.println(variable.getClass());
    }
}
