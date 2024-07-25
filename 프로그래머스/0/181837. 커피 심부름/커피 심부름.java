class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for (String s : order) {
            answer += s.contains("cafelatte") ? 5000 : 4500;
        }
        return answer;
    }
}

// class Solution {
//     public int solution(String[] order) {
//         int answer = 0;  
//         for (String s : order) {
//             if (s.contains("cafelatte")) {
//                 answer += 5000;
//             } else {
//                 answer += 4500;
//             }
//         }       
//         return answer;
//     }
// }

// class Solution {
//     public int solution(String[] order) {
//         int answer = 0;       
//         for (int i = 0; i < order.length; i++) {
//             if (order[i].contains("cafelatte")) {
//                 answer += 5000;
//             } else {
//                 answer += 4500;
//             }
//         }    
//         return answer;
//     }
// }