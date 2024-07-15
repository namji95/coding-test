import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int i = 0;
        int j = 0;
        int temp = 0;
        int[] answer = Arrays.copyOf(arr, arr.length);
        
        for (int[] query : queries) {
            i = query[0];
            j = query[1];
            temp = answer[i];
            
            answer[i] = answer[j];
            answer[j] = temp;
        }
        
        return answer;
    }
}

// class Solution {
//     public List solution(int[] arr, int[][] queries) {
//         List<Integer> answer = new ArrayList<>();
        
//         for (int i : arr) {
//             answer.add(i);
//         }
        
//         for (int[] query : queries) {
//             Collections.swap(answer, query[0], query[1]);
//         }
        
//         return answer;
//     }
// }