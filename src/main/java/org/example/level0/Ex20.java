package org.example.level0;

import java.util.*;

public class Ex20 {

    public static void main(String[] args) {

//        // 중복 문자 제거
//        String my_string = "We are the world";
//        List list = new ArrayList();
//        StringBuilder sb = new StringBuilder();
//
//        for(int i=0; i<my_string.length(); i++) {
//            char tmp = my_string.charAt(i);
//
//            if(!list.contains(tmp)) {
//                list.add(tmp);
//                sb.append(tmp);
//            }
//        }

        String my_string = "we are the world";
        String[] arr = my_string.split("");

        Set<String> set = new LinkedHashSet<>(Arrays.asList(arr));

        String join = String.join("", set);
        System.out.println("join = " + join);


    }
}
