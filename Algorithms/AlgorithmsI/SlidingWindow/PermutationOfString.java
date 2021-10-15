/*
Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
In other words, return true if one of s1's permutations is the substring of s2.

Example 1:
Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").

Example 2:
Input: s1 = "ab", s2 = "eidboaoo"
Output: false
*/

import java.util.*;

public class PermutationOfString {
    public boolean permutationOfString(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();

        if (l2 < l1)
            return false;
        
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < l1; i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(freq1, freq2))
            return true;
        
        for (int i = l1; i < l2; i++){
            //move window
            freq2[s2.charAt(i) - 'a']++;
            freq2[s2.charAt(i - l1) - 'a']--;
            
            if (Arrays.equals(freq1, freq2))
                return true;
        }

        return false;
    }    
}
