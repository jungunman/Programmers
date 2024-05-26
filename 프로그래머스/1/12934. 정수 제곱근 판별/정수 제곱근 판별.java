class Solution {
    public long solution(long n) {
        long answer = -1;
        long divisor = 1;
		
		long range = Long.parseLong("9".repeat( (int)Math.round(Long.toString(n).length()/2)+1));
		
		while (divisor < range) {
			if(Math.pow(divisor, 2) == n) {
				divisor += 1;
				answer = divisor * divisor;
			}
			
			divisor += 1;
		};
        
        return answer;
    }
}