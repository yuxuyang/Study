/*
 Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.
 */
import java.lang.*;

import static java.lang.Character.isLetter;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if(s.length() == 0) {return true;}
        int head = 0, tail = s.length()-1;
        while( head < tail) {
            while(!Character.isLetterOrDigit(s.charAt(head))){
                head++;
                if (head >= tail) {
                    return true;
                }
            }
            while(!Character.isLetterOrDigit(s.charAt(tail))){
                tail--;
                if (head >= tail) {
                    return true;
                }
            }

            if((Character.toLowerCase(s.charAt(head)) == Character.toLowerCase(s.charAt(tail))) && head != tail){
                head++;
                tail--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String s){
        public boolean isPalindrome(String s) {
            if (s.isEmpty()) {
                return true;
            }
            int head = 0, tail = s.length() - 1;
            char cHead, cTail;
            while(head <= tail) {
                cHead = s.charAt(head);
                cTail = s.charAt(tail);
                if (!Character.isLetterOrDigit(cHead)) {
                    head++;
                } else if(!Character.isLetterOrDigit(cTail)) {
                    tail--;
                } else {
                    if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
                        return false;
                    }
                    head++;
                    tail--;
                }
            }

            return true;
        }
    }

    /*
    public boolean isPalindrome(String s){
         String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
         String rev = new StringBuffer(actual).reverse().toString();
         return actual actual.equals(rev);
    }
     */

    public static void main(Stringp[] args){
        String t = "yuuy";
        System.out.println(isPalindrome(t));
    }
}
