// class Solution {
//     public StringBuilder solution(int q, int r, String code) {
//         StringBuilder answer = new StringBuilder();
        
//         for (int i = 0; i < code.length(); i++) {
//             if (i % q == r) {
//                 answer.append(code.charAt(i));
//             }
//         }
        
//         return answer;
//     }
// }

class Solution {
    public StringBuilder solution(int q, int r, String code) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = r; i < code.length(); i += q) {
            answer.append(code.charAt(i));
        }
        
        return answer;
    }
}