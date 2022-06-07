import java.util.*;


public class Solution {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		//Write your code here
        ArrayList<Integer> res = new ArrayList<>();
       
        Collections.sort(arr, Collections.reverseOrder()); // descending order
        // 5 4 2 1 ---> k = 3rd largest 
        res.add(arr.get(arr.size()-k));
        // ascending order 
        // 1 2 4 5 ----> k = 3rd smallest
        Collections.sort(arr); 
        res.add(arr.get(arr.size()-k));
        // return result 
        return res;
        
        
	}
}
