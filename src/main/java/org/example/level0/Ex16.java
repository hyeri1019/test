package org.example.level0;


import java.util.Arrays;

public class Ex16 {
    public static void main(String[] args) {

        // 대문자->소문자 , 소문자->대문자

        String my_string = "abCdEfghIJ";

        char[] arr = my_string.toUpperCase().toCharArray();
        char[] arr2 = my_string.toLowerCase().toCharArray();

        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<arr.length; i++) {
                sb.append(my_string.charAt(i)==arr[i] ? arr2[i] : arr[i]);
        }

        System.out.println(sb);
        
    }
}
