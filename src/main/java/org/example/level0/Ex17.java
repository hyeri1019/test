package org.example.level0;

public class Ex17 {
    public static void main(String[] args) {
        // 두개의 숫자를 순서를 정하여 짝지어 나타낸 쌍(a,b)
        // a*b = n 인 순서쌍의 개수 return

        int n = 100;
        int count = 0;

        for(int i=1; i<=n; i++) {
            if(n%i==0) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
