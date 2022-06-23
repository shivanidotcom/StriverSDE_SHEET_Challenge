import java.util.* ;
import java.io.*; 
/****************************************************************

       Following is the class structure of the Node class:

       class Node {
	int data;
	Node next;
	Node child;

	public Node(int data) {
		this.data = data;
		this.next = null;
		this.child = null;
	}
}
// child -- bottom

*****************************************************************/
public class Solution {
    public static Node mergeList(Node head1, Node head2){
        if(head1==null) return head2;
        if(head2==null) return head1;
        Node left = null;
        Node right = null;
        
        while(head1!=null && head2!=null){
            if(left==null){
                if(head1.data<head2.data){
                    left=head1;
                    right=head1;
                    head1=head1.child;
                }else{
                    left=head2;
                    right=head2;
                    head2=head2.child;
                }
            }else{
                if(head1.data<head2.data){
                    right.child=head1;
                    head1=head1.child;
                    right=right.child;
                }else{
                    right.child=head2;
                    head2=head2.child;
                    right=right.child;
                }
            }
        }
        if(head1!=null){
            right.child=head1;
        }
        if(head2!=null){
            right.child=head2;
        }
        return left;
    }
	public static Node flattenLinkedList(Node start) {
		 //Write your code here
        if(start == null) return null;
        if(start.next == null) return start;
        return mergeList(start,flattenLinkedList(start.next));
	}
}

