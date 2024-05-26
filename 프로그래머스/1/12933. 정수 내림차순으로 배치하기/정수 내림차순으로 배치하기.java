import java.util.ArrayList;
import java.util.Iterator;

class Solution {
    public long solution(long n) {
        long answer = 0;
        int division = 10;
		ArrayList<Long> arr = new ArrayList<Long>();
		
		while(n>0) {
			arr.add(n%10);
			n = n/10;
		}
		
		arr.sort( (a,b) -> (int) (b-a));
        
		String ans = "";
        
		Iterator<Long> it = arr.iterator();
		while(it.hasNext()) {
			ans += it.next().toString();
		}
		
		answer = Long.parseLong(ans);
        return answer;
    }
}