import java.util.*;
class Activity{
    int i;
    Integer start;
    Integer finish;
    Activity(int i,Integer start,Integer finish){
        this.i=i;
        this.start=start;
        this.finish= finish;
    }
}
class mycmp implements Comparator<Activity>{
    public int compare(Activity a1, Activity a2){
        return a1.finish-a2.finish;
    }
}
public class Solution {
    public static int maximumActivities(List<Integer> start, List<Integer> end) {
        //Write your code here
        List<Activity> al = new ArrayList<>();
        for(int i=0;i<start.size();i++){
            al.add(new Activity(i,start.get(i),end.get(i)));
        }
        Collections.sort(al,new mycmp());
        int res = 1;
        int prev = al.get(0).finish;
        for(int i=1;i<al.size();i++){
            if(al.get(i).start>=prev){
                res++;
                prev=al.get(i).finish;
            }
        }
        return res;
    }
}
