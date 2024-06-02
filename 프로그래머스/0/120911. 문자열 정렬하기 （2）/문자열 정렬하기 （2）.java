import java.util.*;

class Solution {
    public StringBuilder solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        char[] charArr = my_string.toLowerCase().toCharArray();
        Arrays.sort(charArr);
        for (char c : charArr) {
            answer.append(c);
        }
        return answer;
    }
}