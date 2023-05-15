package org.example.level0;

import java.util.ArrayList;
import java.util.List;

public class Ex37 {
    public static void main(String[] args) {
        int num = 123456;
        int k = 7;
        
        int answer = 0;
        
        String str = Integer.toString(num);

        int i = str.indexOf(Integer.toString(k));

        answer = i!=-1 ? i+1 : -1;

        System.out.println("answer = " + answer);

    }
}
