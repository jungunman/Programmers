class Solution {
    public String solution(String s) {
        String answer = "";
        String [] splits = s.toLowerCase().split(" ",-1);

        for (String str : splits){
            char [] chars = str.toCharArray();

            for (int i = 0; i < chars.length; i++) {

                if(i % 2 == 0 ){
                    answer += String.valueOf(chars[i]).toUpperCase();
                }else {
                    answer += String.valueOf(chars[i]);
                }
            }

            answer += " ";

        }

        answer= answer.substring(0,answer.length()-1);

        return answer;
    }
}