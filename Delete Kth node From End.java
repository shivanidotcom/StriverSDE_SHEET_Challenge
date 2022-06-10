import java.util.* ;
import java.io.*; 
/****************************************************************
	
	Following is the structure of the Singly Linked List.
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

****************************************************************/

public class Solution {
	public static LinkedListNode<Integer> removeKthNode(LinkedListNode<Integer> head, int K) {
		// Write your code here.
       // create an dummy_head 
        LinkedListNode<Integer> dummy_head = new LinkedListNode<Integer>(0);
        LinkedListNode<Integer> fast = dummy_head;
        LinkedListNode<Integer> slow = dummy_head;
        dummy_head.next = head;
        if(head == null || K == 0){
            return head;
        }
        
        for(int i=0; i< K+1; i++){
            fast= fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy_head.next;
       
	}
}
