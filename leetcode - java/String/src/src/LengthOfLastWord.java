/*
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

Example:

Input: "Hello World"
Output: 5
*/


public class LengthOfLastWord {
    public int lengthOfLastWord1(String s) {
        s = s.trim();
        if (s.length() == 0) return 0;
        int count = 0;
        if (!s.contains(" ")) return s.length();
        for (int i = s.length() -1; i > 0; i--){
            if(s.charAt(i) != ' ') {
                count++;
            } else {
               return count;   
            }
        }
        return count;
    }
    public int lengthOfLastWord2(String s) {
    	return s.trim().length()-s.trim().lastIndexOf(" ")-1;
	}
}
