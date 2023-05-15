package org.example.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ex24 {
    // 배열 회전
    public static void main(String[] args) {

        int[] numbers = {1,2,3};
        String direction = "right";
        int[] answer = new int[numbers.length];

        List<Integer> ints = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        for(int i=0, j=ints.size()-1; i<ints.size(); i++, j--) {
            if(direction.equals("left")) {
                Collections.swap(ints,i,i!=ints.size()-1 ? i+1 : i);
                answer[i] = ints.get(i);
            }

            if(direction.equals("right")) {
                Collections.swap(ints,j,j!=0 ? j-1 : j);
                answer[j] = ints.get(j);
            }
        }
    }
}
