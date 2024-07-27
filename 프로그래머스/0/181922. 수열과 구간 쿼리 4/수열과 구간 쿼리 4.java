import java.util.*;

// class Solution {
//     public int[] solution(int[] arr, int[][] queries) {
//         int[] answer = Arrays.copyOf(arr, arr.length);
//         int s, e, k = 0;
        
//         for (int i = 0; i < queries.length; i++) {
//             s = queries[i][0];
//             e = queries[i][1];
//             k = queries[i][2];
//             for (int j = 0; j < arr.length; j++) {
//                 if (s <= j && e >= j && j % k == 0) {
//                     answer[j] += 1;
//                 }
//             }
//         }
//         return answer;
//     }
// }

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (j % queries[i][2] == 0) {
                    arr[j] += 1;
                }
            }
        }
        return arr;
    }
}