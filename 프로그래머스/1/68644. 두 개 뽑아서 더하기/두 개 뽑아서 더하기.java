
import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> lst = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (!lst.contains(numbers[i] + numbers[j])) {
                    lst.add(numbers[i] + numbers[j]);
                }
            }
        }
        return lst.stream().sorted().mapToInt(i -> i).toArray();
    }
}