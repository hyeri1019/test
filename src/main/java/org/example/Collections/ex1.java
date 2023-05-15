package org.example.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.binarySearch;
import static java.util.Collections.reverseOrder;

public class ex1 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        Collections.addAll(list,1,2,3,4,5);

        // [0]과 [2]를 교환
        Collections.swap(list, 0,2);

        // 랜덤 섞기
        Collections.shuffle(list);

        // 정렬
        Collections.sort(list);

        // 내림차순 정렬
        Collections.sort(list, reverseOrder());

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));


        // 3이 저장된 위치 찾기(바이너리 서치 사용 전 꼭 정렬하기)
        int idx = binarySearch(list, 3);

        // 값이 4인 요소는 모두 1로 바꾸기
        Collections.replaceAll(list,4,1);

        System.out.println(list);

    }

}
