package org.example.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex13 {
    public static void main(String[] args) {
        
        String my_string = "nice to meet you";
//        StringBuffer result = new StringBuffer();
//
//        ArrayList<Character> list = new ArrayList<>();
//        ArrayList<Character> part = new ArrayList<>();
//
//        part.add('a');
//        part.add('e');
//        part.add('i');
//        part.add('o');
//        part.add('u');
//
//
//        for(int i=0; i<my_string.length(); i++) {
//            list.add(my_string.charAt(i));
//            list.removeAll(part);
//        }
//
//        for(int i=0; i<list.size(); i++) {
//            result.append(list.get(i));
//        }
//
//        System.out.println(result.toString());

        String answer = my_string.replaceAll("[aeiou]","");
        System.out.println("answer = " + answer);

    }
}
