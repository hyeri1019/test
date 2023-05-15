package org.example.Steam;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ex2 {

    public static void main(String[] args) {
        /* 객체 배열로부터 스트림 생성하기 */
        String[] strArr = {"a","b","c","d"};
        Stream<String> strStream = Stream.of(strArr);
        strStream.forEach(System.out::println);


        /* 기본형 스트림. 언박싱 없어서 더 빠름 */
        int[] intArr = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(intArr);
        intStream.forEach(System.out::println);

        // 난수 무한 스트림
                                            // 난수 범위(5~9)
        IntStream intStream2 = new Random().ints(5, 10);
                    // 최대 반복 횟수
        intStream2.limit(5).forEach(System.out::println);

        // 특정 범위의 정수 스트림
        IntStream intStream3 = IntStream.range(1,5); // 1,2,3,4
        IntStream intStream4 = IntStream.rangeClosed(1,5); // 1,2,3,4,5




    }
}
