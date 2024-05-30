import java.util.*;

class Solution {
    public List<Integer> solution(int[] numbers, String direction) {
        List<Integer> answer = new ArrayList<>();
        
        for (int num : numbers) {
            answer.add(num);
        }
        
        if (direction.equals("right")) {
            answer.remove(numbers.length - 1);
            answer.add(0, numbers[numbers.length - 1]);
        } else {
            answer.remove(0);
            answer.add(numbers[0]);
        }
        return answer;
    }
}