import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		// Write your code here.
        LinkedListNode<Integer> head=new LinkedListNode(0);
        LinkedListNode<Integer> p=head;
        LinkedListNode<Integer> l1=first;
        LinkedListNode<Integer> l2=second;
        while(l1!=null && l2!=null){
            if(l1.data<l2.data){
                p.next=l1;
                l1=l1.next;
            }else{
                p.next=l2;
                l2=l2.next;
            }
            p=p.next;
        }
        if(l1!=null){
            p.next=l1;
        }
        if(l2!=null){
            p.next=l2;
        }
        return head.next;
        
        
	}
}
