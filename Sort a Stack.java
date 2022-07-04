import java.util.*;
public class Solution {

	public static void sortStack(Stack<Integer> stack) {
		// Write your code here.
        if(stack.isEmpty()){
            return ;
        }
        ArrayList<Integer> al = new ArrayList<>();
      //  System.out.println(stack);
        while(!stack.isEmpty()){
            al.add(stack.peek());
            stack.pop();
        }
      
       
        Collections.sort(al);
     //   System.out.println(al);
        for(int i=0;i<al.size();i++){
            stack.push(al.get(i));
        }
        
	}

}
