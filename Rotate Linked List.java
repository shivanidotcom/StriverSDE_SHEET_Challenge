import java.util.* ;
import java.io.*; 
/***********************************************
    Following is the class structure of the Node class:

    class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

************************************************/

public class Solution {
     static Node head;
    public static Node insert(Node head ,int arrayElement){
        Node newNode = new Node(arrayElement);
        newNode.data = arrayElement;
        newNode.next = head;
        head=newNode;
        return head;
    }
    public static Node arrayLinkedList(ArrayList<Integer> al ,int n){
        head = null;
        for(int i=n-1;i>=0;i--){
            head = insert(head,al.get(i));
        }
        return head;
    }
    public static Node rotate(Node head, int k) {
        // Write your code here.
         ArrayList<Integer> al = new ArrayList<>();
        for(Node curr=head;curr!=null;curr=curr.next){
            al.add(curr.data);
        }
        Collections.rotate(al,k);
       // System.out.println(al);
        head = arrayLinkedList(al,al.size());
        return head;
    }
}
