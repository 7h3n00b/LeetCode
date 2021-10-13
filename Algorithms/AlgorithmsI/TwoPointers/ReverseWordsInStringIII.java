/*
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Example 2:
Input: s = "God Ding"
Output: "doG gniD"
*/

public class ReverseWordsInStringIII{
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String result = "";
        
        for (String word : words) {
            String reversed_word = "";
            
            for (int i=word.length()-1; i >= 0; i--)
                reversed_word += word.charAt(i);
            
            result += " " + reversed_word;
        }
        
        return result.trim();
        
        
//         String[] words = s.split(" ");
//         StringBuilder result = new StringBuilder();
        
//         for (String word : words) {
//             StringBuilder reversed_word = new StringBuilder();
            
//             reversed_word.append(word);
//             reversed_word.reverse();
            
//             result.append(reversed_word.toString() + " ");
//         }
        
//         return result.toString().trim();
    }
    
    
}