package org.example.level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ex4 {
    public static void main(String[] args) {

        String str = "ssibal";

        char[] reverse = new char[str.length()];

        for(int i=0; i<reverse.length; i++) {
            reverse[i] = str.charAt(str.length()-1-i);
        }
        String s = String.valueOf(reverse);
    }

}
