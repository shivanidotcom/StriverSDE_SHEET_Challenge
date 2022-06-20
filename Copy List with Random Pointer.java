import java.util.* ;
import java.io.*; 
/*************************************************************

    Following is the LinkedListNode class structure

    class LinkedListNode<T> {
	    T data;
	    LinkedListNode<T> next;
	    LinkedListNode<T> random;

	    public LinkedListNode(T data) {
		    this.data = data;
	    }
    }

*************************************************************/
import java.util.*;
public class Solution {
	public static LinkedListNode<Integer> cloneRandomList(LinkedListNode<Integer> head) {
		// Write your code here.
        LinkedListNode curr= head;
        HashMap<LinkedListNode, LinkedListNode> hm = new HashMap<>();
        while(curr!=null){
            hm.put(curr,new LinkedListNode(curr.data));
            curr = curr.next;
        }
        curr = head;
        while(curr!=null){
            hm.get(curr).next = hm.get(curr.next);
            hm.get(curr).random = hm.get(curr.random);
            curr=curr.next;
        }
        return hm.get(head);
	}
}
