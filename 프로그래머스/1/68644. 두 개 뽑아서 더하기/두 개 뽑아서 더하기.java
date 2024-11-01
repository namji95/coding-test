// import java.util.*;

// class Solution {
//     public List solution(int[] numbers) {
//         List<Integer> answer = new ArrayList<>();

//         for (int i = 0; i < numbers.length; i++) {
//             for (int j = 0; j < numbers.length; j++) {
//                 int plus = numbers[i] + numbers[j];
//                 if (i != j && !answer.contains(plus)) {
//                     answer.add(plus);
//                 }
//             }
//         }
//         Collections.sort(answer);
        
//         return answer;
//     }
// }

import java.util.*;

class Solution {
    public Set solution(int[] numbers) {
        Set<Integer> answer = new TreeSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                answer.add(numbers[i] + numbers[j]);
            }
        }
        
        return answer;
    }
}