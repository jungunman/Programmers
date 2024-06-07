class Solution {
    public int solution(String s) {
        String [][] words = {{"zero","one","two","three","four","five","six","seven","eight","nine"},
                {"0","1","2","3","4","5","6","7","8","9"}};

        for (int i = 0; i < words[1].length; i++) {
            s = s.replace(words[0][i],words[1][i]);
        }

        return Integer.parseInt(s.toString());
    }
}