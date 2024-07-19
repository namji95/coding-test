class Solution {
    public int solution(int[] array) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        for (int j : array) {
            sb.append(j);
        }
        for (int i = 0; i < sb.length(); i++) {
            if (sb.substring(i, i + 1).equals("7")) {
                answer++;
            }
        }
        return answer;
    }
}

// class Solution {
//     public int solution(int[] array) {
//         int answer = 0;
        
//         for (int j : array) {
//             while (j > 0) {
//                 if (j % 10 == 7) {
//                     answer++;
//                 }
//                 j /= 10;
//             }
//         }
//         return answer;
//     }
// }

// class Solution {
//     public int solution(int[] array) {
//         int answer = 0;
//         StringBuilder sb = new StringBuilder();
        
//         for (int j : array) {
//             sb.append(j);
//         }
//         for (String s : sb.toString().split("")) {
//             if (Integer.parseInt(s) == 7) {
//                 answer++;
//             }
//         }
//         return answer;
//     }
// }