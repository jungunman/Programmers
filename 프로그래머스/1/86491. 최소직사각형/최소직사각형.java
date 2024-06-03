import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        List<Integer> lst = new ArrayList<>();

        for (int [] arr : sizes){
            for (int value : arr){
                lst.add(value);
            }
        }

        lst.sort((a,b) -> b-a);

        int maxH = lst.get(lst.size()/2);

        for (int [] arr : sizes){
            if (maxH < arr[0] && maxH <arr[1]){
                maxH = IntStream.of(arr).min().getAsInt();
            }
        }

        return lst.get(0) * maxH;
    }
}