package Task_2;

import java.util.ArrayList;

public class ThreadSafeList<T> {
    private final ArrayList<T> list = new ArrayList<>();

    public synchronized void add(T element) {
        list.add(element);
    }

    public synchronized int size() {
        return list.size();
    }

    public synchronized boolean remove( T element) {
        return list.remove(element);
    }

    }

