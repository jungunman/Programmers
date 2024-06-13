import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        List<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        String [] str1 = Arrays.stream(arr1).mapToObj(i -> " ".repeat(n-Integer.toBinaryString(i).length())+Integer.toBinaryString(i).replaceAll("0"," ").replaceAll("1","#")).toArray(String[]::new);
        String [] str2 = Arrays.stream(arr2).mapToObj(i -> " ".repeat(n-Integer.toBinaryString(i).length())+Integer.toBinaryString(i).replaceAll("0"," ").replaceAll("1","#")).toArray(String[]::new);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(str1[i].charAt(j) == '#' || str2[i].charAt(j) =='#'){
                    sb.append("#");
                }else {
                    sb.append(" ");
                }
            }
            answer.add(sb.toString());
            sb.delete(0,sb.length());
        }

        return answer.toArray(new String[n]);
    }
}