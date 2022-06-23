/****************************************************************

    Following is the class structure of the Pair class:

        class Pair
        {
        	int weight;
	        int value;
	        Pair(int weight, int value)
	        {
		        this.weight = weight;
		        this.value = value;
	        }
	        
        }
        
*****************************************************************/
import java.util.*;
class itemComparator implements Comparator<Pair>
{
    public int compare(Pair a, Pair b) 
    {
        double r1 = (double)(a.value) / (double)(a.weight); 
        double r2 = (double)(b.value) / (double)(b.weight); 
        if(r1 < r2) return 1; 
        else if(r1 > r2) return -1; 
        else return 0; 
    }
}
public class Solution {
    public static double maximumValue(Pair[] arr, int n, int w) {
            // Write your code here.
    	    // ITEMS contains {weight, value} pairs.
       
        Arrays.sort(arr,new itemComparator());
       
        int curWeight = 0;
        double finalVal = 0;
        for(int i=0; i<arr.length; i++){
            if(curWeight + arr[i].weight <= w){
                curWeight += arr[i].weight;
                finalVal += arr[i].value;
            }
            else{
                int remain = w - curWeight;
                finalVal +=  ((double)arr[i].value/(double)arr[i].weight)*remain;
                break;
            }
        }
        return finalVal;
    }
}
