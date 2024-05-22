class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int p = 0;
		int y = 0;
		
		s = s.toUpperCase();
		
		for (int i = 0; i < s.length(); i++) {
			char at = s.charAt(i);
			if(at =='P') {
				p++;
			}else if(at == 'Y') {
				y++;
			}
		}
		if(p != y) {
			answer = false;
		}
        return answer;
    }
}