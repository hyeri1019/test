package org.example.Arrays;

import java.util.Arrays;
import java.util.List;

public class ex1 {
    public static void main(String[] args) {

        String str = "ㅋㅇㅋ";

        // asList : 인자의 요소를 포함한 List로 생성하여 반환
        List<String> list = Arrays.asList(str);
        System.out.println(list);


        String[] arr = {"ㅇㅅㅇ","ㅇㅁㅇ","ㅇㅂㅇ"};
        List<String> list2 = Arrays.asList(arr);
        System.out.println("list2 = " + list2);
        list2.add("ㅋㅋ");


    }
}
