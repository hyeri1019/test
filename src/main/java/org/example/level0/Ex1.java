package org.example.level0;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputList = input.split(" ");
        long[] inputToInt = new long[inputList.length];

        scanner.close();

        long result = 0;
        
        for(int i=0; i<inputToInt.length; i++) {
            inputToInt[i] = Long.parseLong(inputList[i]);
            result += inputToInt[i];
        }

        System.out.println(result);
    }
}
