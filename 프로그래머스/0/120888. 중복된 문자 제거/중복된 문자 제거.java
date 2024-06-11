import java.util.*;

class Solution {
    public StringBuilder solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        Set<Character> set = new HashSet<>();
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            if (!set.contains(c)) {
                set.add(c);
                answer.append(c);
            }
        }
        
        return answer;
    }
}