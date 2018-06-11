/**
 * Created by yuxuyang on 2018/4/7.
 *
 Given a roman numeral, convert it to an integer.

 Input is guaranteed to be within the range from 1 to 3999.
 */

public class RomanToInteger {
    public static int romanToInt(String s){
        if (s.length()<0) {return 0;}
        int sum = 0;
        char [] target = s.toCharArray();
        for (int i = s.length()-1; i>=0; i--){
            switch(target[i]) {
                case 'I':
                    sum += (sum >= 5 ? -1 : 1);
                    break;
                case 'V': 
                    sum += 5;
                    break;
                case 'X':
                    sum += 10 * (sum >= 50 ? -1 : 1);
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    sum += 100 * (sum >= 500 ? -1 : 1);
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
            }
        }
        return sum;
    }
    public static void main(String args[]){
        System.out.println(romanToInt("III"));
    }
}

