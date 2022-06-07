import java.util.*;
public class Solution {
	public static int removeDuplicates(ArrayList<Integer> nums,int n) {
		// Write your code here.
        LinkedHashSet<Integer> hs=new LinkedHashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        ArrayList<Integer> al=new ArrayList<>(hs);
        int[] arr = new int[al.size()];
        
        return al.size();
	}
}
