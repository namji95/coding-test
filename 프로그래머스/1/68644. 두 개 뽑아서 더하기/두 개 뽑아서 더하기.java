import java.util.*;

class Solution {
    public List solution(int[] numbers) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                int plus = numbers[i] + numbers[j];
                if (i != j && !answer.contains(plus)) {
                    answer.add(plus);
                }
            }
        }
        Collections.sort(answer);
        
        return answer;
    }
}