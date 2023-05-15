package org.example.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex14 {
    public static void main(String[] args) {

        String my_string = "hi4325";

//        char[] arr = new char[my_string.length()];
        List<Character> arr = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            int unicode = (int) my_string.charAt(i);

            if (unicode <= 57) {
                arr.add(my_string.charAt(i));
            }
        }

        Collections.sort(arr);
        int[] answer = new int[arr.size()];

        for(int i=0; i<arr.size(); i++) {
            answer[i] = Character.getNumericValue(arr.get(i));
        }
    }
}