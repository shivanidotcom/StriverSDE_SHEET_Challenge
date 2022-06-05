import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] ninjaAndSortedArrays(int nums1[], int nums2[], int m, int n) {
        // Write your code here.
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        
        for(int i=0;i<m;i++){
           al1.add(nums1[i]);
        }
        for(int i=0;i<n;i++){
            al2.add(nums2[i]);
        }
         
        al1.addAll(al2);
        Collections.sort(al1);
       
        for(int i=0;i<al1.size();i++){
            nums1[i]=al1.get(i);
        }
        return nums1;
    }
}
