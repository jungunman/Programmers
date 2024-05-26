class Solution {
    public long[] solution(int x, int n) {
        long x2= x;
		long [] answer = new long[n];
		
		
		for (long i = 0; i < n; i++) {
			x2 = x * (i+1);
			answer[(int)i] = x2;
		}
        return answer;
    }
}