import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        HashMap<Integer, Integer> line = new HashMap<>();

        for (int[] i : lines) {
            for (int j = i[0]; j < i[1]; j++) {
                line.put(j, line.getOrDefault(j, 0) + 1);
            }
        }
        for (int val : line.values()) {
            if (val > 1) {
                answer++;
            }
        }
        
        return answer;
    }
}

// import java.util.*;

// class Solution {
//     public int solution(int[][] lines) {
//         int answer = 0;
//         HashMap<Integer, Integer> line = new HashMap<>();

//         for (int[] i : lines) {
//             int from = i[0];
//             int to = i[1];
//             for (int j = from; j < to; j++) {
//                 line.merge(j, 1, Integer::sum);
//             }
//         }

//         answer = (int) line.values().stream().filter(i -> i > 1).count();
        
//         return answer;
//     }
// }

// import java.util.*;

// class Solution {
//     public int solution(int[][] lines) {
//         int answer = 0;
        
//         for (int i = -100; i < 100; i++) {
//             int line = 0;
//             if (lines[0][0] <= i && lines[0][1] > i) {
//                 line++;
//             }
//             if (lines[1][0] <= i && lines[1][1] > i) {
//                 line++;
//             }
//             if (lines[2][0] <= i && lines[2][1] > i) {
//                 line++;
//             }
//             if (line > 1) {
//                 answer++;
//             }
//         }
        
//         return answer;
//     }
// }