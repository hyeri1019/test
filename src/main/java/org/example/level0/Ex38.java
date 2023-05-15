package org.example.level0;

import java.util.Arrays;

public class Ex38 {
    public static void main(String[] args) {

        StringBuilder string = new StringBuilder();

        String[] morseList = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String letter = ".... . .-.. .-.. ---";
        String[] morse = letter.split(" ");

        for(String str : morse) {
            for(int i=0; i<morseList.length; i++) {
                if(str.equals(morseList[i])) {
                    string.append(Character.toString(i+'a'));
                }
            }
        }
    }
}
