package org.example.level0;

public class Ex6 {
    public static void main(String[] args) {

       String str = "안녕ㅋ";
       String str2 = new String("안녕ㅋ");
       String str3 = new String("안녕ㅋ");

       boolean result = str2.equals(str3);

        System.out.println("result = " + result);
    }
}
