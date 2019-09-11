package com.github.jcarrillo4.tools;

public interface PoolInterface<T> {

    public void add(T link);

    public T remove(int position);

    public void clear();

    public boolean isEmpty();

    public String toString();

    public boolean isFull();

}
