
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = Arrays.stream(arr).filter(value -> value != Arrays.stream(arr).min().getAsInt()).toArray();

        if(answer.length == 0)
            return new int[]{-1};

        return answer;
    }
}