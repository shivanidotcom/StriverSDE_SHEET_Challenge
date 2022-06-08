import java.util.*;

public class Solution 
{
    public static int uniqueElement(ArrayList<Integer> nums) 
    {
        //    Write your code here.
      
        int l =0;
        for(int i=0;i<nums.size();i++){
            l^=nums.get(i);
           
        }
       
        return l;
    }
}
