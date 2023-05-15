package org.example.Steam;

import java.util.Arrays;
import java.util.stream.Stream;

public class ex4 {
    public static void main(String[] args) {


        String[] arr = {"ssibal", "ssibal2", "ssibal3", "ssibal4", "ssibal5"};

        Stream<String> arrStream = Arrays.stream(arr);
        // flatMap : 배열 스트림을 String 스트림으로 바꿔줌. map 은 스트림의 스트림 형태로 바꿈
        Stream<String> arrStream2 = arrStream.flatMap(s->Arrays.stream(s.split(",")));

        // String 스트림 모두 대문자로 변환
        arrStream2.map(String::toUpperCase).distinct().sorted().forEach(System.out::println);
    }
}
