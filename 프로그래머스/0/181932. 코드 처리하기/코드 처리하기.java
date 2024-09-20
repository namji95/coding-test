// class Solution {
//     public StringBuilder solution(String code) {
//         int mode = 0;
//         StringBuilder answer = new StringBuilder();
        
//         for (int i = 0; i < code.length(); i++) {
//             if (code.charAt(i) == '1') {
//                 mode = mode == 0 ? 1 : 0;
//                 continue;
//             }
//             if (mode == 0 && i % 2 == 0) {
//                 answer.append(code.charAt(i));
//             } else if (mode == 1 && i % 2 != 0) {
//                 answer.append(code.charAt(i));
//             }
//         }
//         if (answer.length() == 0) {
//             answer.append("EMPTY");
//         }
        
//         return answer;
//     }
// }

class Solution {
    public String solution(String code) {
        int mode = 0;
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (c == '1') {
                mode = mode == 0 ? 1 : 0;
                continue;
            }
            
            if (i % 2 == mode) {
                answer.append(c);
            }
        }
        
        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }
}