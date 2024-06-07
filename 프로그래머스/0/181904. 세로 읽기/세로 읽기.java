import java.util.*;

class Solution {
    public StringBuilder solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = c - 1; i < my_string.length(); i += m) {
            answer.append(my_string.charAt(i));
        }
        
//         List<String> newStr = new ArrayList<>();
        
//         for (int i = 0; i < my_string.length(); i += m) {
//             newStr.add(my_string.substring(i, i + m));
//         }
        
//         for (String s : newStr) {
//             answer.append(s.charAt(c-1));
//         }
        
        return answer;
    }
}