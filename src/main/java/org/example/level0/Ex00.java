package org.example.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex00 {
    public static void main(String[] args) {

        /* 배열 스트림 */

        // 0. 배열 생성
        String[] arr = new String[]{"a","b","c"};

        // 1. 스트림으로 변환
        Stream<String> stream = Arrays.stream(arr);

        List<String> list = stream
                .filter(s -> s.length()== 1) // 길이가 1인 문자열만 필터링
                .map(String::toUpperCase) // 중간처리 메서드(map) :: 필터링된 문자들을 대문자로 변환
                .collect(Collectors.toList()); // toList : 새로운 리스트로 변환

        System.out.println(list);



    }
}
