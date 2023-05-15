package org.example.level0;

import org.example.QueueAndStack.MyStackWithArray;
import org.example.QueueAndStack.MyStackWithArrayList;

public class Ex5 {
    public static void main(String[] args) {

        MyStackWithArray stack = new MyStackWithArray();

        stack.push(0);
        stack.push(1);
        stack.push(2);



        MyStackWithArrayList<Object> stack2 = new MyStackWithArrayList<>();

        stack2.push(10);
        stack2.push(20);
        stack2.push(30);

        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());

    }


}

