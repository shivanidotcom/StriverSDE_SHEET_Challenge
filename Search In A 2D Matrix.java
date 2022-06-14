import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> matrix, int m, int n, int target) {
		// Write your code here.
         ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<matrix.size();i++){
            for(int j=0;j<matrix.get(i).size();j++){
                al.add(matrix.get(i).get(j));
            }
        }
        if(al.contains(target)){
            return true;
        }
        return false;
	}
}
