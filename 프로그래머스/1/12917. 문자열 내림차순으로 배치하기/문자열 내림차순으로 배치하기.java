import java.util.List;
import java.util.ArrayList;

class Solution {
    public String solution(String s) {
        char [] arr = s.toCharArray();

        List<String> lst = new ArrayList<>();

        for (char c : arr){
            lst.add(String.valueOf(c));
        }
        
        lst.sort((a,b) -> b.charAt(0) - a.charAt(0));
        
        return String.join("",lst);
    }
}