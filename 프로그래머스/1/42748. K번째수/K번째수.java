import java.util.ArrayList;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> answer = new ArrayList<>();

        ArrayList<Integer> dummy = new ArrayList<>();

        for (int [] commend : commands){
            for (int i = commend[0]-1; i < commend[1] ; i++) {
                dummy.add(array[i]);
            }
            
            dummy.sort((a,b) -> a-b);
            answer.add(dummy.get(commend[2]-1));
            dummy.clear();
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}