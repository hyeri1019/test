package org.example.level0;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex33 {
    public static void main(String[] args) {
        int[] array = {9,10,11,8};
        int[] answer = new int[2];
        
        int max = Arrays.stream(array).max().getAsInt();
        int index = 0;

        for(int i=0; i<array.length; i++) {
            if(array[i]==max) {
                index = i;
            }
        }
        answer[0] = max;
        answer[1] = index;
        
    }
}
