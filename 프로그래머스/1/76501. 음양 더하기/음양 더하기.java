import java.util.Arrays;
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = Arrays.stream(absolutes).sum();
        for (int i = 0; i < absolutes.length; i++) {
            if(!signs[i]){
                answer -= absolutes[i]*2;
            }
        }
        return answer;
    }
}