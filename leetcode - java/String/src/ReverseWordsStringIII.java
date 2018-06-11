/*
Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 */

public class ReverseWordsStringIII {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = 0, start = 0, e = 0;
        while (i < n){
            int j = i;
            while (i<n && arr[i] != ' '){
                i++;
            }
            start = j;
            e = i-1;
            while( start < e){
                char temp = arr[start];
                arr[start++] = arr[e];
                arr[e--] = temp;
            }
            while(i <n && arr[i] == ' '){
                i++;
            }
        }
        return String.valueOf(arr);
    }
}
