import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String input) 
    {
		//write your code here
        HashSet<Character> hs = new HashSet<>();
        int a_pointer=0;
        int b_pointer = 0;
        int max = 0;
        while(b_pointer<input.length()){
            if(hs.contains(input.charAt(b_pointer))){
                hs.remove(input.charAt(a_pointer));
                a_pointer++;
            }else{
                hs.add(input.charAt(b_pointer));
                b_pointer++;
                max=Math.max(hs.size(),max);
            }
        }
        return max;
	}
}
