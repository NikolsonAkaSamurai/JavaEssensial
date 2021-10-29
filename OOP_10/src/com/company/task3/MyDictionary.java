package com.company.task3;

public class MyDictionary <TKey, TValue>{
    private Box<TKey, TValue>[] boxes;
    private int counter = 0;
    private int size = 10;

    MyDictionary(){
        boxes = new Box[size];
    }

    public void add(TKey key, TValue value){
        if(counter >= size - 1) increaseSize();
        int index = counter;
        counter++;
        boxes[index] = new Box<>(key,value);
    }

    private void increaseSize(){
        Box<TKey, TValue>[] buffer = new Box[size];
        for (int i = 0; i < boxes.length; i++) {
            buffer[i] = boxes[i];
        }
        boxes = new Box[size += 10];
        for (int i = 0; i < buffer.length; i++) {
            boxes[i] = buffer[i];
        }
    }

    public TKey getKey(int index){
        return boxes[index].getKey();
    }

    public TValue getValue(int index){
        return boxes[index].getValue();
    }

    @Override
    public String toString() {
        String line = "";
        for (int i = 0; i < boxes.length; i++) {
            if(boxes[i] != null) line += "key: " + boxes[i].getKey() + " value: " + boxes[i].getValue() + "\n";
        }
        return line;
    }
}
