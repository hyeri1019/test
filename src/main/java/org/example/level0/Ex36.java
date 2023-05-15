package org.example.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex36 {
    public static void main(String[] args) {
        int n = 24;

        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=1; i<=n; i++) {
            if(n%i==0) {
                list.add(i);
            }
        }
        int[] answer = list.stream().mapToInt(x->x.intValue()).toArray();
    }
}
