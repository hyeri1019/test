package org.example.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ex31 {
    public static void main(String[] args) {
        String answer = "";

        String my_string = "I love you";

        List<String> list = Arrays.stream(my_string.split("")).collect(Collectors.toList());
        Collections.swap(list,3,6);
        
        answer = String.join("",list);
        System.out.println("answer = " + answer);

    }
}
