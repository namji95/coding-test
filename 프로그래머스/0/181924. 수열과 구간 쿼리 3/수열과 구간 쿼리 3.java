import java.util.*;

class Solution {
    public List solution(int[] arr, int[][] queries) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i : arr) {
            answer.add(i);
        }
        
        for (int[] query : queries) {
            Collections.swap(answer, query[0], query[1]);
        }
        
        return answer;
    }
}