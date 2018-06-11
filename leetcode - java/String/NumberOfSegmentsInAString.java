package com.company;
import java.lang.*;

public class NumberOfSegmentsInAString {
    public static int countSegments(String s) {
        s = s.trim();
        if (s.length() == 0) return 0;
        String[] a = s.split("\\s+");
        return a.length;
    }

    public int countSegments2(String s) {
        int res=0;
        for(int i=0; i<s.length(); i++)
            if(s.charAt(i)!=' ' && (i==0 || s.charAt(i-1)==' '))
                res++;
        return res;
    }

    public static void main(String[] args ){
        String s = "    foo    bar";
        System.out.println(countSegments(s));
    }
}