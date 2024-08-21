import java.util.*;

public class Solution {
    public List solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        
        for (int i = 0; i < arr.length; i++) {
            if (answer.get(answer.size() - 1) != arr[i]) {
                answer.add(arr[i]);
            }
        }

        return answer;
    }
}