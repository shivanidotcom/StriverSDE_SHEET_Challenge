import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

        class Node
		{
		    public int data;
		    public Node next;

		    Node(int data)
		    {
		        this.data = data;
		        this.next = null;
		    }
		}

*****************************************************************/

public class Solution 
{
    public static Node firstNode(Node head) 
    {
        //    Write your code here.
         if(head==null||head.next==null) return null;
    
        Node slow  = head;
        Node fast  = head;
        
        do{
            if(fast==null||fast.next==null) return null;
            slow = slow.next;
            fast  = fast.next.next;
        }
        while(slow!=fast);
        
        slow = head;
        
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
        
    }
}
