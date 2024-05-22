import java.util.*;

public class Solution {
    public int solution(int n) {
        String sn = n+"";
		int sum = 0;
		for (int i = 0; i < sn.length(); i++) {
			sum += Integer.parseInt(sn.charAt(i)+"");
		}

        return sum;
    }
}