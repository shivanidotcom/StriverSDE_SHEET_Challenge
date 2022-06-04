import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
       HashSet<Integer> hs=new HashSet<>();
        for(int i:arr){
            if(hs.contains(i)){
                return i;
            }else{
                hs.add(i);
            }
        }
        return -1;
    }
}
