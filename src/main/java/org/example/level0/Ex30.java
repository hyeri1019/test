package org.example.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex30 {
    public static void main(String[] args) {

        int n = 3;
        int[] numlist = {4,5,6,7,8,9,10,11,12};


        int[] answer = Arrays.stream(numlist).filter(value -> value%n==0).toArray();

    }
}
