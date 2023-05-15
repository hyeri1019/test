package org.example.Lamda;

public class MyFunction {
    public static void main(String[] args) {

        // Function 인터페이스 구현체
//        Function f = new Function() {
//            public int max(int a, int b) {
//                return a > b ? a : b;
//            }
//        };
        Function f = (a, b) -> a > b ? a : b;
        int value = f.max(1,2);





    }
}
