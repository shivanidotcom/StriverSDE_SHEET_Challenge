import java.util.ArrayList;
import java.util.*;
public class Solution 
{
	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
	{
		// Write your code here.
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<k; i++){
            result.addAll(kArrays.get(i));
        }
        Collections.sort(result);
        return result;
	}
}
