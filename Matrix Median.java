import java.util.*;

public class Solution
{
	public static int getMedian(ArrayList<ArrayList<Integer>> matrix)
	{
		// Write your code here.
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<matrix.size();i++){
            for(int j=0;j<matrix.get(i).size();j++){
                al.add(matrix.get(i).get(j));
            }
        }
        Collections.sort(al);
      //  System.out.println(al);
        if(al.size()%2==0){
            int p = al.size()/2;
            int q = (al.size()+1)/2;
            return al.get(p+q);
        }
        return al.get(al.size()/2);
        
	}
}
// 1 2 3 5 6 7 8 9 11
