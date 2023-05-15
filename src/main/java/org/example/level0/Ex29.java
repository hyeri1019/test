package org.example.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ex29 {
    public static void main(String[] args) {

        int[] numbers = {-10,10,5,1,7,-4,-7,-11,-15,-5};
        int answer = 0;

        Arrays.sort(numbers);

        int a = numbers[0]*numbers[1];
        int b = numbers[numbers.length-1]*numbers[numbers.length-2];

        answer = a > b ? a : b;
        System.out.println("answer = " + answer);
    }
}
