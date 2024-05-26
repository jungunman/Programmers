

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
		int tmp = x;
		int sum = 0;
		  while(tmp/10 > 0) {
			 
			 sum += tmp%10;
			 tmp /= 10;
			 
			 if(tmp < 10) {
				 sum += tmp;
				 break;
			 }
			 
		 }
		 
        if(sum ==0)
            sum =1;
        
		 if(x % sum != 0) 
			 answer = false;
        
        return answer;
    }
}