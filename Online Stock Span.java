import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public static ArrayList<Integer> findSpans(ArrayList<Integer> price) {
        // Write your code here.
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<price.size();i++){
            while(!stack.isEmpty() &&  price.get(i)>=price.get(stack.peek())){
                stack.pop();
            }
            if(stack.isEmpty()){
                res.add(i+1);
            }else{
                res.add(i-stack.peek());
            }
            stack.push(i);
        }
        return res;
    }
}
