import java.util.ArrayList;
import java.util.*;
public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i=1; i<=n; i++){
            arr2.add(i);
        }
        arr2.removeAll(arr);
       // System.out.println(arr2);
      //  System.out.println(arr2);
        HashSet<Integer> freq = new LinkedHashSet<>();
        for(int i=0; i<arr.size(); i++){
            int value = Collections.frequency(arr, arr.get(i));
            if(value>1){
                freq.add(arr.get(i));
            }
        }
      //  System.out.println(freq);
        arr2.addAll(freq);
       // System.out.println(arr2);
        int[] result = new int[arr2.size()];
        for(int i=0; i<arr2.size(); i++) {
            result[i] = arr2.get(i);
        }
        return result;
    }
}
