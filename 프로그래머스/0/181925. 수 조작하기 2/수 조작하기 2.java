class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for (int i = 1; i < numLog.length; i++) {
            int j = numLog[i] - numLog[i - 1];
            switch (j) {
                case 1 : answer += 'w';
                    break;
                case -1 : answer += 's';
                    break;
                case 10 : answer += 'd';
                    break;
                case -10 : answer += 'a';
            }
        }
        
        return answer;
    }
}

// class Solution {
//     public StringBuilder solution(int[] numLog) {
//         StringBuilder answer = new StringBuilder();

//         for (int i = 1; i < numLog.length; i++) {
//             int j = numLog[i] - numLog[i - 1];
//             switch (j) {
//                 case 1 : answer.append("w");
//                     break;
//                 case -1 : answer.append("s");
//                     break;
//                 case 10 : answer.append("d");
//                     break;
//                 case -10 : answer.append("a");
//             }
//         }
        
//         return answer;
//     }
// }

// class Solution {
//     public StringBuilder solution(int[] numLog) {
//         StringBuilder answer = new StringBuilder();
        
//         for (int i = 1; i < numLog.length; i++) {
//             if (numLog[i] == numLog[i - 1] + 1) {
//                 answer.append("w");
//             } else if (numLog[i] == numLog[i - 1] - 1) {
//                 answer.append("s");
//             } else if (numLog[i] == numLog[i - 1] + 10) {
//                 answer.append("d");
//             } else if (numLog[i] == numLog[i - 1] - 10) {
//                 answer.append("a");
//             }
//         }
        
//         return answer;
//     }
// }