// import java.util.*;

// class Solution {
//     public List solution(int[] arr, int[][] queries) {
//         List<Integer> answer = new ArrayList<>();
        
//         for (int[] query : queries) {
//             int temp = 1000000;
//             int s = query[0], e = query[1], k = query[2];
//             for (int i = s; i <= e; i++) {
//                 if (arr[i] > k) {
//                     temp = Math.min(temp, arr[i]);
//                 }
//             }
//             if (temp == 1000000){
//                 temp = -1;
//             }
//             answer.add(temp);
//         }
        
//         return answer;
//     }
// }

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, -1);

        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int s = query[0], e = query[1], k = query[2];
            for (int j = s; j <= e; j++) {
                if (arr[j] > k) {
                    answer[i] = answer[i] == -1 ? arr[j] : Math.min(answer[i], arr[j]);
                }
            }
        }
        
        return answer;
    }
}