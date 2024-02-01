import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] c = s.toCharArray();
        Arrays.sort(c);
        String str = new String(c);
        answer = new StringBuilder(str).reverse().toString();
        return answer;
    }
}