import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

    class LinkedListNode {
        int data;
        LinkedListNode next;
        
        public LinkedListNode(int data) {
            this.data = data;
        }
    }

*****************************************************************/


public class Solution {
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        LinkedListNode result = new LinkedListNode(0);
        LinkedListNode head = result;
       int carry=0;
        
        // for equal length
        while( head1!=null && head2!=null){
            int sum = head1.data+head2.data+carry;
            carry= sum/10;
            result.next = new LinkedListNode(sum%10);
            result = result.next; 
            head1= head1.next;
            head2 = head2.next;
        }
        // when extra elements in head1
         while(head1!=null){
            int sum = head1.data+carry;
            carry= sum/10;
            result.next = new LinkedListNode(sum%10);
            result = result.next; 
            head1= head1.next;
          
        }
        // when extra elements in head2
         while(head2!=null){
            int sum = head2.data+carry;
            carry= sum/10;
            result.next = new LinkedListNode(sum%10);
            result = result.next; 
            head2= head2.next;
          
        }
        if(carry>0){
            result.next = new LinkedListNode(carry);
            result = result.next;
        }
        return head.next;
    }
}
