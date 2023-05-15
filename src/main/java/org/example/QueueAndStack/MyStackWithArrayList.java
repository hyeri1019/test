package org.example.QueueAndStack;

import java.util.ArrayList;
import java.util.List;

public class MyStackWithArrayList<T> {
    private List<T> data;

    public MyStackWithArrayList() {
        data = new ArrayList<>();
    }

    public void push(T i) {
        data.add(i);
    }

    public T pop() {
        return data.remove(data.size()-1);
    }

}
