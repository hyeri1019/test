package org.example.level0;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputList = input.split(" ");
        long[] inputToInt = new long[inputList.length];

        scanner.close();


        for(int i=0; i<inputToInt.length; i++) {
            inputToInt[i] = Long.parseLong(inputList[i]);
        }

        if(inputToInt[0] > inputToInt[1]) {
            System.out.println(">");
        }
        if(inputToInt[0] < inputToInt[1]) {
            System.out.println("<");
        }
        if(inputToInt[0] == inputToInt[1]) {
            System.out.println("==");
        }
    }
}
