package org.example.level0;

public class Ex34 {
    public static void main(String[] args) {
        int answer = 0;
        int n = 7;

        for (int i = 1; i <= 6 * n; i++) {
            if (6 * i % n == 0) {
                answer = i;
                break;
            }
        }
        System.out.println("answer = " + answer);
        
        
    }
}
