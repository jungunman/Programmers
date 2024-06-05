class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char word =s.charAt(i);
            if (word == ' '){
                answer.append(word);
                continue;
            }
            if(String.valueOf(word).matches("^[A-Z]")){
                answer.append((char)('A'+(word+n-'A')%26));
            }else{
                answer.append((char)('a'+(word+n-'a')%26));
            }
        }

        return answer.toString();
    }
}