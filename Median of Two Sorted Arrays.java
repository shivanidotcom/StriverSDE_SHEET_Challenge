import java.util.*;
public class Solution {
    public static double median(int[] nums1, int[] nums2) {
    	// Write your code here.
          ArrayList<Integer> al = new ArrayList<>();
        for(int i: nums1){
            al.add(i);
        }
        for(int i: nums2){
            al.add(i);
        }
        Collections.sort(al);
        int n = al.size();
        if(al.size()%2!=0){
                    // if the size is odd
            return (double)al.get(n/2);
        }
        int p = al.get((n/2)-1);
      //  System.out.println(p);
        // 1 2 3 4 ---> al.get(2-1) --> 2
        int q = al.get((n/2));
        // System.out.println(q);
        // 1 2 3 4 ----> al.get(2);
       //  System.out.println((double)(p+q)/2);
        return (double)(p+q)/2;
    }
}
