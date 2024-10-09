import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        HashMap<Integer, Integer> line = new HashMap<>();
        int answer = 0;
        
        for (int[] i : lines) {
            for (int j = i[0]; j < i[1]; j++) {
                line.put(j, line.getOrDefault(j, 0) + 1);
            }
        }
        for (int val : line.values()) {
            if (val > 1) {
                answer++;
            }
        }
        
        return answer;
    }
}