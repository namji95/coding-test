import java.util.*;

// class Solution {
//     public List solution(String my_str, int n) {
//         int j = 0;
//         List<String> answer = new ArrayList<String>();
        
//         if (my_str.length() % n != 0) {
//             j = my_str.length() / n + 1;
//         } else {
//             j = my_str.length() / n;
//         }
        
//         for (int i = 0; i < j; i++) {
//             if ((i + 1) * n < my_str.length()) {
//                 answer.add(my_str.substring(i * n, (i + 1) * n));
//             } else {
//                 answer.add(my_str.substring(i * n));
//             }
//         }
        
//         return answer;
//     }
// }

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        
        if (my_str.length() % n != 0) {
            answer = new String[my_str.length() / n + 1];
        } else {
            answer = new String[my_str.length() / n];
        }
        
        for (int i = 0; i < answer.length; i++) {
            if ((i + 1) * n < my_str.length()) {
                answer[i] = my_str.substring(i * n, (i + 1) * n);
            } else {
                answer[i] = my_str.substring(i * n);
            }
        }
        
        return answer;
    }
}