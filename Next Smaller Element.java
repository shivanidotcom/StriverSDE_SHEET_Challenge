import java.util.*;
import java.io.*;

public class Solution{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        // Write your code here.
        Stack<Integer> s = new Stack<>();

       s.push(-1);

       ArrayList<Integer> ans = new ArrayList<>();

       for(int i=n-1;i>=0;i--){

           int cur = arr.get(i);

           while(s.peek()>=cur){

               s.pop();

           }

           ans.add(s.peek());

           s.push(cur);

       }

       Collections.reverse(ans);

       return ans;
    }
}
