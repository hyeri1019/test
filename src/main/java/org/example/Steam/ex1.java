package org.example.Steam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ex1 {
    public static void main(String[] args) {

        /* 컬렉션으로부터 스트림 생성하기 */
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        // List -> Stream 으로 변환 (Collection 인터페이스의 stream())
        Stream<Integer> intStream = list.stream();
        // 스트림의 모든 요소를 출력(출력 후 닫힘)
        intStream.forEach(System.out::println);

        intStream = list.stream();
        intStream.forEach(System.out::println);



    }
}
