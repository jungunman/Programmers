
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length <=1)
            return new int[]{-1};

        int[] answer = Arrays.stream(arr).filter(value -> value != Arrays.stream(arr).min().getAsInt()).toArray();
        return answer;
    }
}