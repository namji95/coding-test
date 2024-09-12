// class Solution {
//     public int solution(int chicken) {
//         int answer = 0;
        
//         for (int i = 1; i <= chicken; i++) {
//             if (i % 10 == 0) {
//                 chicken++;
//                 answer++;
//             }
//         }
        
//         return answer;
//     }
// }

class Solution {
    public int solution(int chicken) {
        int answer = chicken / 9;
        
        if (chicken > 1 && chicken % 9 == 0) {
            answer--;
        }
        
        return answer;
    }
}