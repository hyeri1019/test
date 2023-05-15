package org.example.level0;


public class Ex9 {
    public static void main(String[] args) {

        String my_string = "abcedf";
        String letter = "f";


        StringBuilder result = new StringBuilder();

        // my_string 에서 letter 를 제거한 문자열 return

        for(int i=0; i<my_string.length(); i++) {
            char[] toChar = my_string.toCharArray();
            char letterToChar = letter.charAt(0);

            if(toChar[i]!=letterToChar) {
                result.append(toChar[i]);
            }
        }
        
        String answer = result.toString();
        System.out.println("answer = " + answer);

    }
}
