import java.util.*;
public class Solution {
    public static boolean matching(char a, char b){
        return ((a=='(' && b==')') ||
                 (a=='[' && b==']') ||
                (a=='{' && b=='}')
               );
    }
    public static boolean isValidParenthesis(String expression) {
        // Write your code here.
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<expression.length(); i++){
            if(expression.charAt(i)=='(' || 
               expression.charAt(i)=='[' ||
               expression.charAt(i)=='{'){
                    stack.push(expression.charAt(i));
            }else{
                if(stack.isEmpty()==true){
                    return false;
                }else if(matching(stack.peek(), expression.charAt(i))==false){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        return stack.isEmpty()==true;
    }
}
