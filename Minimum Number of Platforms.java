import java.util.*;
public class Solution {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
        // Write your code here.
        Arrays.sort(at);
        Arrays.sort(dt);
        int platform=1,res=1;
        int i=1,j=0;
        while(i<n && j<n){
            if(at[i]<=dt[j]){
                platform++;
                i++;
            }
            else if(at[i]>dt[j]){
                platform--;
                j++;
            }
            if(platform>=res){
                res=platform;
            }
        }
        return res;
    }
}
