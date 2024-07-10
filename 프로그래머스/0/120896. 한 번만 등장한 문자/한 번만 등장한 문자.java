import java.util.*;

class Solution {
    public StringBuilder solution(String s) {
        String[] str = s.split("");
        Arrays.sort(str);
        int cnt = 0;
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < str.length; i++) {
            cnt = 0;
            for (int j = 0; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                answer.append(str[i]);
            }
        }
        
        return answer;
    }
}