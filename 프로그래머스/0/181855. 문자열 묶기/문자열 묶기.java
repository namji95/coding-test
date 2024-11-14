// import java.util.*;

// class Solution {
//     public int solution(String[] strArr) {
//         int answer = 0;
//         HashMap<Integer, Integer> map = new HashMap<>();

//         for (String str : strArr) {
//             map.put(str.length(), map.getOrDefault(str.length(), 0) + 1);
//         }
//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//             if (answer < entry.getValue()) {
//                 answer = entry.getValue();
//             }
//         }
        
//         return answer;
//     }
// }

import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] lengArr = new int[31];
        
        for (int i = 0; i < strArr.length; i++) {
            lengArr[strArr[i].length()]++;
        }

        for (int i = 0; i <= 30; i++) {
            answer = Math.max(answer, lengArr[i]);
        }
        
        return answer;
    }
}