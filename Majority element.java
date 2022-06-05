import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findMajority(int[] nums, int n) {
		// Write your code here.
       HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
      //  System.out.println(map);
        int max = n/2;
        int ele = -1;
        for(int key : map.keySet()){
            if(map.get(key) > max){
                
                ele = key;
            }
        }
        return ele;
	}
}
