package org.example.level0;

import java.util.ArrayList;
import java.util.List;

public class Ex26 {
    public static void main(String[] args) {
        String rsp = "205";
        
        char[] arr = new char[]{'2','0','5'};

        char[] tmp = new char[rsp.length()];

        for(int i=0; i<rsp.length(); i++) {
            for(int j=0; j<arr.length; j++) {
                if(arr[j]==rsp.charAt(i)) {
                    tmp[i] = j!= arr.length-1 ? arr[j+1] : arr[0];
                }
            }
        }
        String answer = new String(tmp);
        System.out.println("answer = " + answer);
    }
}
