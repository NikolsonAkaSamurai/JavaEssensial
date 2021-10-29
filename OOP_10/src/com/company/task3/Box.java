package com.company.task3;

public class Box <TKey, TValue>{
    private TKey key;
    private TValue value;

    Box(TKey key, TValue value){
        this.key = (TKey)key;
        this.value = (TValue) value;
    }

    public TKey getKey() {
        return key;
    }

    public void setKey(TKey key) {
        this.key = key;
    }

    public TValue getValue() {
        return value;
    }

    public void setValue(TValue value) {
        this.value = value;
    }
}
