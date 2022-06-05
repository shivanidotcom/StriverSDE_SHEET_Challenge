import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
      //  System.out.println(map);
        int max=arr.size()/3;
      
        ArrayList<Integer> res = new ArrayList<>();
        for(int i : map.keySet()){
             if(map.get(i) > max){
                res.add(i);
            }
        }
        return res;
    }
}
