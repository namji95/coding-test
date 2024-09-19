// import java.util.*;

// class Solution {
//     public int[] solution(int[] arr, int[] query) {
//         int[] answer = {};
        
//         for (int i = 0; i < query.length; i++) {
//             if (i % 2 == 0) {
//                 arr = Arrays.copyOfRange(arr, 0, query[i] + 1);
//             } else {
//                 arr = Arrays.copyOfRange(arr, query[i], arr.length);
//             }
//         }
//         answer = Arrays.copyOf(arr, arr.length);
        
//         return answer;
//     }
// }

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        int start = 0;
        int end = arr.length - 1;
        
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                end = start + query[i] - 1;
            } else {
                start += query[i];
            }
        }
        answer = Arrays.copyOfRange(arr, start, end + 2);
        
        return answer;
    }
}