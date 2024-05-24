class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        String sn = Long.toString(n);
		answer = new int [sn.length()];
		for (int i = 0; i <sn.length(); i++) {
			answer[i] = Integer.parseInt(String.valueOf(sn.charAt(sn.length()-i-1)));
		}
        return answer;
    }
}