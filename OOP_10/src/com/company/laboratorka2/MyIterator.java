package com.company.laboratorka2;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {

    private T[] t;

    public MyIterator(T[] t) {
       this.t = t;

    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }
}
