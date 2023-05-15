package org.example.level0;

import java.util.Arrays;

public class Ex15 {
    public static void main(String[] args) {

        String my_string = "Bcad";

        char[] arr = my_string.toLowerCase().toCharArray();
        Arrays.sort(arr);
        String answer = new String(arr);

        System.out.println("answer = " + answer);
    }

}