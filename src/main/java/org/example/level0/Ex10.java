package org.example.level0;

import java.util.Arrays;

public class Ex10 {
    public static void main(String[] args) {

       int price = 50000;

       int answer = 0;

       // 10만원 이상 5%, 30만원 이상 10%, 50만원 이상 20% 할인
        if(price>=100000 && price<300000) {
            answer = price -= price * 0.05;
        }
        if(price>=300000 && price<500000) {
            answer = price -= price * 0.1;
        }
        if(price>=500000) {
            answer = price -= price * 0.2;
        }

        else {
            answer = price;
        }

        System.out.println(answer);

    }
}
