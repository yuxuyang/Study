import java.lang.Math;
import java.awt.print.*;
/**
 * Created by yuxuyang on 2018/5/10.
 */
public class CountBinarySubstrings {
    public static int solution1(String s){
        int cur = 1, pre = 0, res = 0;
        for (int i = 1; i< s.length(); i++){
            if (s.charAt(i) == s.charAt(i - 1)) cur++;
            else {
                res +=Math.min(cur, pre);
                pre = cur;
                cur = 1;
            }
        }
        return res + Math.min(cur, pre);
    }
    public static int solution2(String s){
        int prevRunLength = 0, curRunlength = 1, res = 0;
        for (int i =1; i < s.length(); i++){
            if (s.charAt(i) == s.charAt(i-1)) curRunlength++;
            else {
                prevRunLength = curRunlength;
                curRunlength = 1;
            }
            if (prevRunLength >= curRunlength) res++;
        }
        return res;
    }

    public static void main (String args[]){
        System.out.println(solution1("00110011"));
    }
}
