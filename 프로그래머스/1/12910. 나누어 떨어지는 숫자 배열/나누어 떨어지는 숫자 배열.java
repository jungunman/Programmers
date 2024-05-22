import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> filter = new ArrayList<Integer>();
			
        for(int value : arr){
            int res = value%divisor;
            if (res == 0) {
               filter.add(value);
            }
        }

        filter.sort((o1, o2) -> o1-o2);

        int [] answer;
        if(filter.size() == 0 ) {				
            answer = new int [] {-1};
        }else {
            answer = new int [filter.size()];
            for (int i = 0; i < answer.length; i++) {
            answer[i] = filter.get(i);
        }
        }
        
        return answer;
    }
}