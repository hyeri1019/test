package org.example.Steam;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

public class ex3 {
    public static void main(String[] args) {

        File[] fileArr = {new File("Ex1.java"),new File("Ex1.bak"), new File("Ex2.java"),new File("Ex1"),new File("Ex1.txt")};
        Stream<File> fileStream = Stream.of(fileArr);

        // map() 으로 Stream<File> -> Stream<String> 변환
        Stream<String> filenameStream = fileStream.map(File::getName);
        filenameStream.forEach(System.out::println);

        // 스트림 다시 열기
        fileStream = Arrays.stream(fileArr);
        fileStream.map(File::getName)
                .filter(s->s.indexOf('.')!=-1)
                .map(s->s.substring(s.indexOf('.')+1))
                .map(String::toUpperCase)
                .distinct()
                .forEach(System.out::print);
        System.out.println(); // JAVABAKTXT
    }
}
