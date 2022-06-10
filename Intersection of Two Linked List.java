import java.util.* ;
import java.io.*; 
/************************************
	 
	 //Following is the class structure of the LinkedListNode class:
	 
	  class LinkedListNode<T> {
		public T data;
		public LinkedListNode<T> next;
		
		public LinkedListNode(T data) {
			this.data = data;
			this.next = null;
		}
	}

*****************************************/
public class Solution {

	public static int findIntersection(LinkedListNode<Integer> firstHead, LinkedListNode<Integer> secondHead) {
        LinkedHashSet<LinkedListNode<Integer>> hs=new LinkedHashSet<>();
        for(LinkedListNode<Integer> curr=firstHead;curr!=null;curr=curr.next){
            hs.add(curr);
        }
       // System.out.println(hs);
        for(LinkedListNode<Integer> curr=secondHead;curr!=null;curr=curr.next){
            
            if(hs.contains(curr)){
                return curr.data;
            }
        }
        return -1;
		
	}
}
