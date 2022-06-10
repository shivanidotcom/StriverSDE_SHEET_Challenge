import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

       class Node 
        { 
        public:
            int data;
            Node next;
            Node(int data) 
            {
              this.data = data;
              this.next = null;
            }
        };

*****************************************************************/

public class Solution {
    public static Node findMiddle(Node head) 
    {
        // Write your code here
       int count=0;
        for(Node curr = head; curr!=null; curr=curr.next){
            count++;
        }
        Node curr = head;
        int mid = count/2;
        for(int i=0; i<mid; i++){
            curr = curr.next;
        }
        return curr;
    }
}
