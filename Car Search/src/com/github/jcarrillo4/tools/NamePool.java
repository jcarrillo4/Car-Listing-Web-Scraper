package com.github.jcarrillo4.tools;

public class NamePool<T> implements PoolInterface<T> {

    private T[] names;
    static final int MAX_SIZE = 5;

    public NamePool() {
        names = (T[]) new Object[MAX_SIZE];

    }

    @Override
    public void add(T name) {

    }

    @Override
    public T remove(int position) {
        return names[position];
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }
}

