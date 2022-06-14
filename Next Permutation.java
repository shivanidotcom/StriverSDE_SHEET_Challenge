import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> al) 
	{
		// Write your code here.
        int i = al.size()-2;
        while(i>=0 && al.get(i)>=al.get(i+1)){
            i--;
        }
        if(i>=0){
            int j = al.size()-1;
            while(j>=0 && al.get(j)<=al.get(i)){
                  j--;
            }
            swap(al,i,j);
        }
        reverse(al,i+1);
        return al;
	}
    public static void swap(ArrayList<Integer> al , int i,int j){
        Collections.swap(al,i,j);
        
    }
    public static void reverse(ArrayList<Integer> al , int start){
        int end = al.size()-1;
        while(start<end){
            swap(al,start,end);
            start++;
            end--;
        }
        
        
    }
}
