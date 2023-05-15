package org.example.level0;

public class Ex11 {
    public static void main(String[] args) {

        String my_string = "hello";
        int n = 3;

        StringBuffer sb = new StringBuffer();

        char[] toChar = my_string.toCharArray();

        for(int i=0; i<toChar.length; i++) {
            for(int j=0; j<n; j++) {
                sb.append(toChar[i]);
            }
        }
        System.out.println(sb.toString());


    }

}
