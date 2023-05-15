package org.example.level0;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex32 {
    public static void main(String[] args) {
        int age = 23;

        String[] arr = Integer.toString(age).split("");
        
        String[] str = "abcdefghij".split("");
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<arr.length; i++) {
            sb.append(str[Integer.parseInt(arr[i])]);
        }

    }
}
