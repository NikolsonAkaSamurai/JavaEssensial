package com.company.task2;

public class MyList <T>{

    private  int size = 10;
    private T[] box;
    private  int counter;

    MyList(){
        box = (T[])(new Object[size]);
    }

    //добавление элемента в список
    public void add(T t){
        if(counter >= size-1) increaseSize();
        int index = counter;
        counter++;
        box[index] = t;
    }

    //получение элемента из списка
    public T get(int index){
       return  box[index];
    }

    //метод автоматического расширения массива
    public void increaseSize(){

        Object[] box2 = (T[])(new Object[size]);
        for (int i = 0; i < box.length; i++) {
            box2[i] = box[i];
        }
        box = (T[])(new Object[size+=10]);
        for (int i = 0; i < box2.length; i++) {
            box[i] = (T)(box2[i]);
        }

    }

    //переопределенный метод Object - toString
    @Override
    public String toString() {
        String line = "";
        for (int i = 0; i < box.length; i++) {
            line += box[i] + " ";
        }
        return line;
    }
}
