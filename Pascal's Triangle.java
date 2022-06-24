import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
        ArrayList<ArrayList<Long>> result = new ArrayList<>();
        ArrayList<Long> prev = null;
        for(int i=0;i<n;i++){
            ArrayList<Long> al = new ArrayList<>();
            for(int j =0;j<=i;j++){
                if(j==0 || j==i){
                    al.add((long)1);
                }else{
                    al.add(prev.get(j)+prev.get(j-1));
                }
               
            }
            
            prev = al;
            result.add(al);
            
        }
        return result;
	}
}
