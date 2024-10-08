// import java.util.*;

// class Solution {
//     public String[] solution(String[] picture, int k) {
//         String[] temp = new String[picture.length];
        
//         for (int i = 0; i < picture.length; i++) {
//             temp[i] = "";
//             for (int j = 0; j < picture[i].length(); j++) {
//                 for (int l = 0; l < k; l++) {
//                     temp[i] += picture[i].charAt(j);
//                 }
//             }
//         }
        
//         String[] answer = new String[picture.length * k];
        
//         for (int i = 0; i < answer.length; i++) {
//             for (int j = 0; j < k; j++) {
//                 answer[i] = temp[i / k];
//             }
//         }
        
//         return answer;
//     }
// }

import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int idx = 0;
        
        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < k; j++) {
                StringBuilder sb = new StringBuilder();
                
                for (int m = 0; m < picture[i].length(); m++) {
                    sb.append(String.valueOf(picture[i].charAt(m)).repeat(k));
                }
                answer[idx++] = sb.toString();
            }
        }
        
        return answer;
    }
}