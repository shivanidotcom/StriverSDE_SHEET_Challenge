import java.util.*;
public class Stack {
    int[] arr;
    int cap ,top;
    Stack(int val){
        cap=val;
        top=-1;
        arr=new int[cap];
    }
    void push(int num) {
        // Write your code here.
       if(cap-top!=1){
           top++;
           arr[top]=num;
       }
    }
    int pop() {
        // Write your code here.
        if(top!=-1){
            int x = arr[top];
            top--;
            return x;
        }else{
            return -1;
        }
    }
    int top() {
        // Write your code here.
         if(top!=-1){
            int x = arr[top];
                 return x;
        }else{
            return -1;
        }
    }
    int isEmpty() {
        // Write your code here.
       if(top==-1){
           return 1;
       }else{
           return 0;
       }
    }
    int isFull() {
        // Write your code here.
       if(cap-top==1){
           return 1;
       }else{
           return 0;
       }
    }
}
