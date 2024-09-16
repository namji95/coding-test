// class Solution {
//     public StringBuilder solution(String my_string, int[][] queries) {
//         StringBuilder answer = new StringBuilder(my_string);
        
//         for (int i = 0; i < queries.length; i++) {
//             StringBuilder front = new StringBuilder();
//             StringBuilder back = new StringBuilder();
//             StringBuilder reverse = new StringBuilder();
//             if (queries[i][0] > 0) {
//                 front.append(answer.substring(0, queries[i][0]));
//             }
//             if (queries[i][1] < my_string.length()) {
//                 back.append(answer.substring(Math.min(queries[i][1] + 1, my_string.length())));
//             }
//             reverse.append(answer.substring(queries[i][0], Math.min(queries[i][1] + 1, answer.length())));
//             reverse.reverse();
//             answer.setLength(0);
//             answer
//                 .append(front)
//                 .append(reverse)
//                 .append(back);
//         }
        
//         return answer;
//     }
// }

// class Solution {
//     public String solution(String my_string, int[][] queries) {
//         String answer = my_string;
        
//         for (int i = 0; i < queries.length; i++) {
//             int s = queries[i][0];
//             int e = queries[i][1];
            
//             StringBuilder reverse = new StringBuilder(answer.substring(s, e + 1));
//             reverse.reverse();
            
//             if (s == 0) {
//                 answer = reverse + answer.substring(e + 1);
//             } else {
//                 answer = answer.substring(0, s) + reverse + answer.substring(e + 1);
//             }
//         }
        
//         return answer;
//     }
// }

class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder(my_string);
        
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            
            StringBuilder reverse = new StringBuilder(answer.substring(s, e + 1));
            reverse.reverse();
            
            answer.replace(s, e + 1, reverse.toString());
        }
        
        return answer.toString(); // 최종 결과를 String으로 반환
    }
}
