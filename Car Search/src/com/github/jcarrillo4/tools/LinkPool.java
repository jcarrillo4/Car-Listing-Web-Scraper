package com.github.jcarrillo4.tools;

public class LinkPool<T> implements PoolInterface<T> {

    static final int MAX_SIZE = 3;
    private T[] links;

    public LinkPool() {
        links = (T[]) new Object[MAX_SIZE];
    }


    @Override
    public void add(T link) {
        for (int i = 0; i < MAX_SIZE; i++) {
            if (links[i] == null) {
                links[i] = link;
                break;
            } else {

            }
        }

    }

    @Override
    public T remove(int position) {
        return links[position];
    }

    @Override
    public void clear() {
        for (T link : links) {
            link = null;
        }

    }

    @Override
    public String toString() {
        String format = "";
        for (T link : links) {
            format += link + "\n";
        }
        return format;
    }

    @Override
    public boolean isEmpty() {
        if (links[0] != null) {
            return true;
        }

        return false;
    }

    @Override
    public boolean isFull() {
        if (links[links.length] != null) {
            return true;
        }
        return false;
    }
}
