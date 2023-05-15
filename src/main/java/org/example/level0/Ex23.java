package org.example.level0;

public class Ex23 {
    public static void main(String[] args) {
        // 암호화된 문자열 해독(code 의 배수 번째 글자만 진짜 암호)

        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;

        System.out.println(cipher.length());
        
        StringBuilder sb = new StringBuilder();
        

        for(int i=0; i<cipher.length()+1; i++) {
            System.out.println("i = " + i);
            if(i!=0 && i%code==0) {
                System.out.println("add = " + i);
                sb.append(cipher.charAt(i-1));
            }
        }
        System.out.println("sb.toString() = " + sb.toString());

    }
}
