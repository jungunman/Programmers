class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int n2 = n;
        int divisor = m;

        while(true){
            if ( divisor == 0){
                answer[0] = n;
                break;
            }
            int tmp = divisor;
            divisor = n % divisor;
            n = tmp;
        }

        answer[1] = (n2 * m) / answer[0];

        return answer;
    }
}