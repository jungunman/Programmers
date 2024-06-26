
import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String,Integer> point = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            point.put(name[i],yearning[i]);
        }
        int index = 0;
        for (String [] names : photo){
            int sum = 0;
            for (String person : names){
                if (point.containsKey(person)){
                    sum += point.get(person);
                }
            }
            answer[index] = sum;
            index++;
        }

        return answer;
    }
}