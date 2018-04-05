/*
67
Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".
*/
public class Solution {
    public static String addBinary(String a, String b) {
        int la = a.length()-1, lb = b.length()-1, carry = 0;
        StringBuilder result = new StringBuilder();
        while(la >= 0 || lb >= 0 ){
            int sum = carry;
            if(la >=0 ) sum += a.charAt(la--)-'0';
            if(lb >= 0) sum += b.charAt(lb--)-'0';
            carry = sum / 2;
            result.append(sum%2);
        }
        if (carry > 0 ) result.append(carry);
        return result.reverse().toString();
    }
}