// import java.util.*;

// class Solution {
//     public int solution(int[] d, int budget) {
//         int sum = 0;
//         int answer = 0;
//         Arrays.sort(d);
        
//         for (int i = 0; i < d.length; i++) {
//             if (sum <= budget) {
//                 sum += d[i];
//                 answer++;
//             }
//             if (sum > budget) {
//                 sum -= d[i];
//                 answer--;
//             }
//         }
        
//         return answer;
//     }
// }

import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        
        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if (budget < 0) {
                break;
            }
            answer++;
        }
        
        return answer;
    }
}