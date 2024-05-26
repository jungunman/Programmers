class Solution {
    public int solution(int[] numbers) {
       int answer = 0;
    	String str ="";
    	for (int i : numbers) {
			str += String.valueOf(i);
		}
    	
    	for (int i = 0; i < 10; i++) {
			if(!str.contains(Integer.toString(i))) {
				answer += i;
			}
		}
    	
        return answer;
    }
}