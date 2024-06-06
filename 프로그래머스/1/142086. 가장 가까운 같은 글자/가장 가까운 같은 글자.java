class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            boolean isFind = false;
            char word = s.charAt(i);

            for (int j = i-1; j >= 0; j--) {
                if (word == s.charAt(j)){
                    isFind = true;
                    answer[i] = i-j;
                    break;
                }
            }
            if (!isFind){
                answer[i] = -1;
            }
        }

        return answer;
    }
}