// class Solution {
//     public int solution(int[] common) {
//         int answer = 0;
        
//         if (common[1] - common[0] == common[2] - common[1]) {
//             answer = common[common.length - 1] + (common[1] - common[0]);
//         } else {
//             answer = common[common.length - 1] * (common[1] / common[0]);
//         }
        
//         return answer;
//     }
// }

class Solution {
    public int solution(int[] common) {
        int i = common[0];
        int ii = common[1];
        int iii = common[2];
        int last = common[common.length - 1];
        int answer = 0;
        
        if (ii - i == iii - ii) {
            answer = last + (ii - i);
        } else {
            answer = last * (ii / i);
        }
        
        return answer;
    }
}