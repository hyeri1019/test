package org.example.level0;

public class Ex18 {
    public static void main(String[] args) {
        // 각 자리 숫자 합

        int answer = 0;
        int n = 930211;

        String str = ""+n;

        char[] arr = str.toCharArray();

        for(int i=0; i<arr.length; i++) {
            answer += Character.getNumericValue(arr[i]);
        }
    }
}
