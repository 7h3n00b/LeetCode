/*
Given a string s, find the length of the longest substring without repeating characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

Example 4:
Input: s = ""
Output: 0
*/

import java.util.*;

public class LongestSubStringWithoutRepeatingCharacter {
    public static int longestSubstringWithoutRepeatingCharacter(String s) {
        int a = 0;
        int b = 0;
        int max_count = 0;

        Set<Character> hash_set = new HashSet<>();
        
        while (b < s.length()) {
            if (!hash_set.contains(s.charAt(b))) {
                hash_set.add(s.charAt(b));
                b++;
                max_count = Math.max(hash_set.size(), max_count);
            } else {
                hash_set.remove(s.charAt(a));
                a++;
            }
        }
        
        return max_count;
        
    }
}