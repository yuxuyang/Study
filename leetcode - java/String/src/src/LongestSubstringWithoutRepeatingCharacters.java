/*
3
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters{
	private static int lengthOfLongestSubstring(String s){
		if (s.length() == 0 )return 0;// return 0 when it is an empty string.
      	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
      	int max = 0; // the max substring
      	// use i to go though every character, j is the pointer that shows the current substring it is calculating from.
      	for (int i = 0, j =0; i< s.length(); i++){
        	if (map.containsKey(s.charAt(i))){// by using map.containsKeys() to check when it meet the duplicate char, which means end current calculation.
          		j = Math.max(j, map.get(s.charAt(i))+1);// update j after find duplicate char, by using Math.max() to 
          		//prevent that j's position will not go back to the data it already have in the hashMap.
          		//such as abba, the second a should not located to older 'a', 
          		//every time you start a new substring, j must be at the first duplicated char.
        	}
        	map.put(s.charAt(i), i);// update the new char or new location for the old char.
        	max = Math.max(max, i-j+1);// updating the max.
      	}
      	return max;
    }
    /* C++ version
    public static int lengthOfLongestSubstring2(String s){
    	// for ASCII char sequence, use this as a hashmap.
    	vector<int> charIndex(256, -1);
    	int longest = 0, m = 0;
    	for (int i = 0; i < s.length(); i++){
    		m = max(charIndex[s[i]]+1, m); // automatically takes care of -1 case;
    		charIndex[s[i]] = i;
    		longest = max(longest, i-m+1);
    	}
    	return longest;
    }
    */
    public static void main(String args[]){
        System.out.print(lengthOfLongestSubstring("Yuxu"));
    }
}

