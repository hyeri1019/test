package org.example.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex12 {
    public static void main(String[] args) {
        int n = 15;
        int num = n%2==0 ? n/2 : n/2+1;

        int[] answer = new int[num];

        for(int i=0; i<num; i++) {
            answer[i] = i*2+1;
            System.out.println(answer[i]);

        }

    }
 }
