package org.example.level0;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        scanner.close();

        if(input>=90) {
            System.out.println("A");
        }

        else if(input>=80) {
            System.out.println("B");
        }
        else if(input>=70) {
            System.out.println("C");
        }
        else if(input>=60) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
}
