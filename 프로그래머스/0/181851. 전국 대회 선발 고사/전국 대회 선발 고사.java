import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer> list = Arrays.stream(rank).boxed().collect(Collectors.toList());
        int[] temp = new int[3];
        int tempIdx = 0;
        int idx = 0;
        
        for (int i = 0; i < rank.length; i++) {
            idx = list.indexOf(i + 1);
            if (attendance[idx] && tempIdx < 3) {
                temp[tempIdx] = idx;
                tempIdx++;
            }
        }
        
        return (temp[0] * 10000) + (temp[1] * 100) + temp[2];
    }
}