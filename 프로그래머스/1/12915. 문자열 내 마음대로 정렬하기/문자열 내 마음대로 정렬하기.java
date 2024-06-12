import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        List<String> lst = new ArrayList<>(Arrays.asList(strings));

        lst.sort((a,b) -> {
            int res = a.charAt(n)- b.charAt(n);
            if (a.charAt(n)- b.charAt(n) == 0){
                res = a.compareTo(b);
            }
            return res;
        });

        return lst.stream().toArray(String[]::new);
    }
}