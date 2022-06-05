import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] nums, int n) {
		// write your code here
         long sum=nums[0];
        long maxSum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(sum<0){
                sum=nums[i];
            }else{
                sum+=nums[i];
            }
            maxSum=Math.max(sum,maxSum);
        }
        if(maxSum<0){
            return 0;
        }
        return maxSum;
	}

}
