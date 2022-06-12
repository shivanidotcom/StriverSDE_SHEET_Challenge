import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the LinkedListNode class:
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		// Write your code here!
         LinkedListNode<Integer> slow = head;
        boolean ispalin = true;
        Stack<Integer> stack = new Stack<Integer>();
 
        while (slow != null)
        {
            stack.push(slow.data);
            slow = slow.next;
        }
 
        while (head != null)
        {
            int i = stack.pop();
            if (head.data == i)
            {
                ispalin = true;
            }
            else
            {
                ispalin = false;
                break;
            }
            head = head.next;
        }
        return ispalin;
	}
}
