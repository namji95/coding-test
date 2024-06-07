import java.util.*;

class Solution {
    public StringBuilder solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        List<String> newStr = new ArrayList<>();
        
        for (int i = 0; i < my_string.length(); i += m) {
            newStr.add(my_string.substring(i, i + m));
        }
        
        for (String s : newStr) {
            answer.append(s.charAt(c-1));
        }
        
        return answer;
    }
}