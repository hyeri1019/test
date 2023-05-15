package org.example.QueueAndStack;

public class MyStackWithArray {
    private int[] data = new int[10];
    private int topIndex = -1;

    public void push(int i) {
        System.out.println("1 topIndex = " + topIndex);
        topIndex++;
        System.out.println("2 topIndex = " + topIndex);

        if (topIndex >= data.length) {
            int[] oldData = data;
            data = new int[data.length * 2];
            for (int j = 0; j < oldData.length; j++) {
                data[j] = oldData[j];
            }
        }
        data[topIndex] = i;
    }

    public int pop() {
        System.out.println("3 topIndex = " + topIndex);
        if (topIndex < 0) {
            throw new RuntimeException("empty stack");
        }
        return data[topIndex--];
    }
}
