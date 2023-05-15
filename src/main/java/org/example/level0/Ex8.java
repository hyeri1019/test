package org.example.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex8 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        String[] arr = {"첫번째[0]","첫번째[1]","첫번째[2]"};
        String[] arr2= {"두번째[0]","두번째[1]","두번째[2]"};
        String[] arr3 = {"세번째[0]","세번째[1]","세번째[2]"};

        list.add(Arrays.toString(arr));
        list.add(Arrays.toString(arr2));
        list.add(Arrays.toString(arr3));


        //  문자열 파싱
        for(int i=0; i<list.size(); i++) {
            String pick = list.get(i);
            String[] parsed = pick.substring(1).split(",");
            String element = parsed[parsed.length-1];
            String element2 = parsed[1];
            System.out.println("element = " + element);
            System.out.println("element2 = " + element2);
        }

    }
}
