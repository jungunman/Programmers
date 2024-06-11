class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            if (food[i] > 1){
                answer.append(Integer.toString(i).repeat(food[i]/2));
            }
        }
        
        String reverse = answer.reverse().toString();
        return answer.reverse().append(0).append(reverse).toString();
    }
}