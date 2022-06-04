import java.util.* ;
import java.io.*; 
import java.util.ArrayList.*;
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        ArrayList<Integer> zero=new ArrayList<>();
        ArrayList<Integer> ones=new ArrayList<>();
        ArrayList<Integer> twos=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero.add(arr[i]);
            }else if(arr[i]==1) {
                ones.add(arr[i]);
            }else if(arr[i]==2){
                twos.add(arr[i]);
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        res.addAll(zero);
        res.addAll(ones);
        res.addAll(twos);
        
        for(int i=0;i<arr.length;i++){
            arr[i]=res.get(i);
        }
        
    }
}
