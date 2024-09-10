// import java.util.*;

// class Solution {
//     public int[] solution(int[][] score) {
//         double[] avg = new double[score.length];
//         int[] answer = new int[score.length];

//         for (int i = 0; i < score.length; i++) {
//             avg[i] = (double) (score[i][0] + score[i][1]) / 2.0;
//         }

//         for (int i = 0; i < avg.length; i++) {
//             int rank = 1;
//             for (int j = 0; j < avg.length; j++) {
//                 if (avg[i] < avg[j]) {
//                     rank++;
//                 }
//             }
//             answer[i] = rank;
//         }
        
//         return answer;
//     }
// }

import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        List<Integer> scoreList = new ArrayList<>();
        
        for (int[] t : score) {
            scoreList.add(t[0] + t[1]);
        }
        scoreList.sort(Comparator.reverseOrder());

        int[] answer = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            answer[i] = scoreList.indexOf((score[i][0] + score[i][1])) + 1;
        }
        
        return answer;
    }
}