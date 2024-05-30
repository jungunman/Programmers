import java.util.*;

public class Solution {
     public int[] solution(int []arr) {
        List<Integer> lst = new ArrayList<>();
       int before = 10000001;

        for (int i = 0; i < arr.length ; i++) {
            if(before != arr[i]){
                lst.add(arr[i]);
                before = arr[i];
            }
        }
        
        return lst.stream().mapToInt(Integer::intValue).toArray();
    }
}