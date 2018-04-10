package com.company;
import java.lang.*;

public class RepeatedSubstringPattern {
    //18 ms
    public static boolean solution(String s) {
        int l = s.length();
        for (int i = l/2; i > 0; i--){
            if(l%i == 0){
                String test = s.substring(0,i);
                int j;
                for (j = 0; j < s.length(); j+=i){
                    if(!test.equals(s.substring(j,j+i))) break;
                }
                if (j == s.length()) return true;
            }
        }
        return false;
    }
    // 109 ms
    public static boolean solution2(String s) {
        int l = s.length();
        for (int i = l/2; i > 0; i--){
            if(l%i == 0){
                String test = s.substring(0,i);
                String target = s;
                while (target.length() > 0){
                    if(target.substring(0, i).equals(test)){
                        target = target.substring(i,target.length());
                    } else break;
                }
                if (target.length() == 0) return true;
            }
        }
        return false;
    }
    // 这个有问题
    public static boolean solution3(String s) {
        if (s.length() == 1) return false;

        int len = s.length(), mid = len / 2; // half
        if (s.substring(0, mid).equals(s.substring(mid))) return true;

        int one_third = len/3; // 1/3
        String sub = s.substring(0, one_third);
        if (sub.equals(s.substring(one_third, one_third * 2))
                && sub.equals(s.substring(one_third * 2))) return true;

        if (len % 2 == 1) { // odd number of characters
            char c = s.charAt(0);
            for (int i = 1; i < len; i++) {
                if (s.charAt(i) != c) return false;
            }
            return true;
        }

        return false;
    }

    public static void main(String[] args){
        String a = "abccbabccbabccbabccbabccb";
        System.out.println(solution3(a));
    }

}
