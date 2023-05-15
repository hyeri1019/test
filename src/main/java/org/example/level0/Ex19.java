package org.example.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex19 {

    public static void main(String[] args) {
        // 같은 원소의 개수

        int answer = 0;
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};

        if (s1 != null && s2 != null) {
            int size = Math.min(s1.length, s2.length);
            int size2 = Math.max(s1.length, s2.length);

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size2; j++) {
                    if (s1[i] == s2[j]) {
                        answer++;
                    }
                }
            }
            System.out.println("answer = " + answer);
        }
    }
}
