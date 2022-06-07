import java.util.* ;
import java.io.*; 
public class Solution{
    public static int[][] pairSum(int[] nums, int target) {
        // Write your code here.
       int n = nums.length;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i=0; i<n;i++){
            //ArrayList<Integer> al = newArrayList<>();
            for(int j = i+1 ; j<n ; j++){
                if(nums[i]+nums[j]==target){
                    result.add(new ArrayList<>(Arrays.asList(Math.min(nums[i], nums[j]), Math.max(nums[i], nums[j]))));
                }
            }
        }
      //  Collections.sort(result);
     //   System.out.println(result);
        result.forEach(Collections::sort);
        Collections.sort(result, (l1, l2) -> l1.get(0).compareTo(l2.get(0)));
      //  System.out.println(result);
        int[][] res = new int[result.size()][result.get(0).size()];
        for(int i=0;i<result.size();i++){
            for(int j=0;j<result.get(0).size();j++){
                res[i][j]= result.get(i).get(j);
            }
        }
        return res;
    }
}
