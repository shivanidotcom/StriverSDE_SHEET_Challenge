public class Solution {	
      
	public static String longestPalinSubstring(String s) {
		// Write your code here.
       int start = 0;
        int end = 0;
        int maximum = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int left = i; // start with one letter
            int right = i;
            
            while (left - 1 >= 0 && right + 1 < s.length() && 
                   s.charAt(left - 1) == s.charAt(right + 1)) {
                left--;
                right++;
            }
            
            if (left >= 0 && right < s.length() && right - left + 1 > maximum) {
                maximum = right - left + 1;
                start = left;
                end = right + 1;
            }
            
            left = i + 1; // start with two letter
            right = i;
            while (left - 1 >= 0 && right + 1 < s.length() && 
                   s.charAt(left - 1) == s.charAt(right + 1)) {
                left--;
                right++;
            }
            
            if (left >= 0 && right < s.length() && right - left + 1 > maximum) {
                maximum = right - left + 1;
                start = left;
                end = right + 1;
            }
        }
        
        return s.substring(start, end);
        
	}
}
