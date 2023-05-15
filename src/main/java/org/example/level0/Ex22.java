package org.example.level0;

public class Ex22 {
    public static void main(String[] args) {

        // 제곱수 판별하기

        int n = 144;
        int add = 0;
        int i = 2;
        int answer = 0;

        while (n>=add) {
            add = 0;
            add = i * i;
            if(add==n) {
                break;
            }
            if(n-add<i) {
                break;
            }
            i++;
        }
        answer = add == n ? 1 : 2;

    }
}
