import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        List<Integer> lst = Arrays.stream(d).boxed().sorted().collect(Collectors.toList());

        for (Integer value : lst){
            budget -= value;
            if(budget >= 0){
                answer ++;
            }
        }

        return answer;
    }
}