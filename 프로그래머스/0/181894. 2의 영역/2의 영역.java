import java.util.*;

class Solution {
    public List solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        
        for (int j : arr) {
            answer.add(j);
        }
        
        int firstIndex = answer.indexOf(2);
        int lastIndex = answer.lastIndexOf(2);
        
        if (firstIndex == -1) {
            return Collections.singletonList(-1);
        } else {
            return answer.subList(firstIndex, lastIndex + 1);
        }
    }
}