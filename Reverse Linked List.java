import java.util.* ;
import java.io.*; 
/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
       
       
        LinkedListNode<Integer> curr = head;
         LinkedListNode<Integer> prev = null;
        while(curr!=null){
           LinkedListNode<Integer> dummy = curr.next;
            curr.next = prev;
            prev = curr;
            curr = dummy;
            
        }
        return prev;
    }
}
