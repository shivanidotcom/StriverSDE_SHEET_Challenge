public class Queue {
  int arr[] ;
        int qfront ;
        int rear ; 
        int size ;
    Queue() {
        // Implement the Constructor
        size = 100001;
        arr = new int[size];
        qfront = 0 ;
        rear = 0 ;
    }

    /*----------------- Public Functions of Queue -----------------*/

    boolean isEmpty() {
        // Implement the isEmpty() function
        if(qfront == rear){
            return true;
        }
        else{
            return false;
        }
    }

    void enqueue(int data) {
        // Implement the enqueue() function
        if(rear == size){
            System.out.println("Queue is full");
        }
        else{
            arr[rear] = data ;
            rear++ ;
        }
    }

    int dequeue() {
        // Implement the dequeue() function
        if(qfront == rear){
            return -1 ;
        }
        else{
            int ans = arr[qfront];
            arr[qfront]=-1;
            qfront++ ;
            if(qfront == rear){
                qfront = 0 ;
                rear = 0 ;
            }
            return ans;
        }
    }

    int front() {
        // Implement the front() function
        if(qfront == rear){
            return -1 ;
        }
        else{
            return arr[qfront];
        }
    }

}
