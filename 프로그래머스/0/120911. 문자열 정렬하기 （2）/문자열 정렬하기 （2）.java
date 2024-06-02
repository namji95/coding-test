import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        
        return new String(c);
    }
}

// class Solution {
//     public StringBuilder solution(String my_string) {
//         StringBuilder answer = new StringBuilder();
//         char[] charArr = my_string.toLowerCase().toCharArray();
//         Arrays.sort(charArr);
//         for (char c : charArr) {
//             answer.append(c);
//         }
//         return answer;
//     }
// }