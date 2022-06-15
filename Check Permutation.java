import java.util.*;
public class Solution {
    public static boolean areAnagram(String str1, String str2){
        // Write your code here.
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String s1 = new String(ch1);
        String s2 = new String(ch2);
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
}
