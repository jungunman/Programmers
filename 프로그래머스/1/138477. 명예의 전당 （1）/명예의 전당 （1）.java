
import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> rank = new ArrayList<>();

        for (int i = 0; i < answer.length; i++) {
            rank.add(score[i]);
            rank.sort((a, b) -> b - a);
            
            if (i < k){
                answer[i] = rank.get(i);
                continue;
            }

            answer[i] = rank.get(k-1);
            rank.remove(k);
        }

        return answer;
    }
}