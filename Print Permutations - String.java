import java.util.*;
public class Solution {
    static List<String> list = new ArrayList<>();
    public static List<String> findPermutations(String s) {
        // Write your code here.
        ArrayList<Character> ch = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            ch.add(s.charAt(i));
        }
        permute(ch,0);
        return list;
    }
    public static void permute(ArrayList<Character> ch ,int ele){
        for(int i=ele;i<ch.size();i++){
            Collections.swap(ch,i,ele);
            permute(ch,ele+1);
            Collections.swap(ch,ele,i);
        }
        
        if(ele == ch.size()-1){
            String res = "";
            for(int i=0;i<ch.size();i++){
                res += ch.get(i);
            }
            list.add(res);
        }
    }
}
