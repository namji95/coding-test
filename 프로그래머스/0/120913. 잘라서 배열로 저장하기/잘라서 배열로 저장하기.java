import java.util.*;

class Solution {
    public List solution(String my_str, int n) {
        int j = 0;
        List<String> answer = new ArrayList<String>();
        
        if (my_str.length() % n != 0) {
            j = my_str.length() / n + 1;
        } else {
            j = my_str.length() / n;
        }
        
        for (int i = 0; i < j; i++) {
            if ((i + 1) * n < my_str.length()) {
                answer.add(my_str.substring(i * n, (i + 1) * n));
            } else {
                answer.add(my_str.substring(i * n));
            }
        }
        
        return answer;
    }
}