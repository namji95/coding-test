// import java.util.*;

// class Solution {
//     public int solution(int[][] dots) {
//         int answer = 0;

//         for (int i = 0; i < dots.length; i++) {
//             for (int j = i + 1; j < dots.length; j++) {
//                 for (int k = 0; k < dots.length; k++) {
//                     for (int l = k + 1; l < dots.length; l++) {
//                         if (i != k && i != l && j != k && j != l) {
//                             if ((dots[j][1] - dots[i][1]) * (dots[l][0] - dots[k][0]) == (dots[l][1] - dots[k][1]) * (dots[j][0] - dots[i][0])) {
//                                 answer = 1;
//                                 break;
//                             }
//                         }
//                     }
//                     if (answer == 1) {
//                         break;
//                     }
//                 }
//                 if (answer == 1) {
//                     break;
//                 }
//             }
//             if (answer == 1) {
//                 break;
//             }
//         }
        
//         return answer;
//     }
// }

import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        if (parallel(0, 1, 2, 3, dots) ||
            parallel(0, 2, 1, 3, dots) ||
            parallel(0, 3, 1, 2, dots)) {
            answer = 1;
        }
        
        return answer;
    }
    
    private static boolean parallel(int a, int b, int c, int d, int[][] dots) {
    int x = (dots[a][0] - dots[b][0]) * (dots[c][1] - dots[d][1]);
    int y = (dots[a][1] - dots[b][1]) * (dots[c][0] - dots[d][0]);

    return x == y; // 기울기가 같은지 확인
  }
}