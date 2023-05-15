package org.example;

import java.util.*;

public class bbbbbbbbbbb {
    public static void main(String[] args) {

        // char[] -> String
        char[] ch = {'a','b','c'};
        String str = new String(ch);
        System.out.println("str = " + str);

        // String -> char[]
        String str2 = "ㅇㅅㅇ";
        char[] ch2 = str2.toCharArray();
        System.out.println(Arrays.toString(ch2));

        // String 뒤집기
        StringBuilder sb = new StringBuilder("냐냐냥");
        sb.reverse();
        System.out.println(sb.toString());

        // 배열 요소의 뒤집기
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"가","차","라","나");
        Collections.addAll(list,"가2","차2","라2","나2");
        Collections.addAll(list,"가3","차3","라3","나3");
        Collections.reverse(list);
        System.out.println("list = " + list);

        // 배열 요소의 문자열 바꾸기
        Collections.replaceAll(list,"가","꺄");
        System.out.println("list = " + list);

        // 배열 요소끼리 바꾸기
        Collections.swap(list,0,5);
        System.out.println("list = " + list);
        
        // String 문자열에서 영어를 제외한 숫자만 출력.
        String str3 = "hiHi1019".replaceAll("[a-zA-Z]","");
        System.out.println("str3 = " + str3);
        
        // String 문자열에서 a와 i를 제외
        String str4 = "aaaaaaki".replaceAll("[ai]","");
        System.out.println("str4 = " + str4);

        // 해당 요소를 포함한 배열을 List 로 변환
        String[] arr2 = {"냥냥","냠냠","ㅋㅋ"};
        List<String> list2 = Arrays.asList(arr2);
        System.out.println("list2 = " + list2);

        // 배열 정렬
        int[] intArr = {3,6,1,2};
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));

        // 배열 역순 정렬
        int[] intArr2 = {3,6,1,2};
        Arrays.sort(intArr2);

        for(int i=0, j=intArr2.length-1; i<j; i++, j--) {
            int tmp = intArr2[i];
            intArr2[i] = intArr2[j];
            intArr2[j] = tmp;
        }
        System.out.println(Arrays.toString(intArr2));




    }
}
