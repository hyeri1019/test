package org.example.level0;

public class Ex27 {
    public static void main(String[] args) {

        int[] box = {10,8,6};
        int n = 3;
        int answer = 0;

        for(int i : box) {
            int a = box[0]/n;
            int b = box[0]/n;
            int c = box[0]/n;
            answer = a*b*c;
        }
    }
}
