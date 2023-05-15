package org.example.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.binarySearch;
import static java.util.Collections.reverseOrder;

public class ex2 {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();

        Collections.addAll(list,"라","가","다","바","차","나");

        Collections.sort(list);

        Collections.replaceAll(list,"가","ㅠㅠ");


        System.out.println("list = " + list);

    }
}
