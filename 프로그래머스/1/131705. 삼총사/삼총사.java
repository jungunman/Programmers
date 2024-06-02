class Solution {
    public int solution(int[] number) {
        int cnt = 0;
        int [] idx = new int[]{0,1,2};
        
        while(idx[0] != number.length-2){
           int three = number[idx[0]] + number[idx[1]] + number[idx[2]];
            if (three == 0) {
                cnt++;
            }

            if (idx[1] == number.length-2) {
                idx[0]++;
                idx[1] = idx[0];
            }

            if(idx[2] == number.length-1){
                idx[1]++;
                idx[2] = idx[1];
            }

            idx[2]++;
        }

        return cnt;
    }
}