package org.example.level0;

public class Ex21 {
    public static void main(String[] args) {

        String my_string = "aAb1B2cC34oOp".replaceAll("[a-zA-Z]","");

        int answer = 0;

//        for(int i=0; i<my_string.length(); i++) {
//            answer += (int) my_string.charAt(i)-'0';
//        }

        for(char c : my_string.toCharArray()) {
            answer += Character.getNumericValue(c);
        }
        System.out.println("answer = " + answer);


    }
}
