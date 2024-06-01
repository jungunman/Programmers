class Solution {
    public int solution(int n) {
        String answer = "";
        char [] chars = Integer.toString(n,3).toCharArray();

        for (int i = chars.length-1; i >=0 ; i--) {
            answer+=chars[i];
        }
        
        return Integer.parseInt(answer,3);
    }
}