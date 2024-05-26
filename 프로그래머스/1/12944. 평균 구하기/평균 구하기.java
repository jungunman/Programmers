class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for (int value : arr){
            answer += value;
        }
        answer = answer/arr.length;
        return answer;
    }
}