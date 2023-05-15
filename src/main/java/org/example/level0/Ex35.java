package org.example.level0;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex35 {
    public static void main(String[] args) {
        
        int order = 369;
        String[] arr = Integer.toString(order).split("");
        
        int answer = (int) Stream.of(arr).filter(x->(x.equals("3")) || x.equals("6") || x.equals("9")).count();

        System.out.println("answer = " + answer);
    }
}
