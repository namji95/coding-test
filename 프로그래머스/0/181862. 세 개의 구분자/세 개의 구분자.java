import java.util.*;

class Solution {
    public List solution(String myStr) {
        List<String> answer = new ArrayList<>();
        myStr = myStr.replace("a", " ");
        myStr = myStr.replace("b", " ");
        myStr = myStr.replace("c", " ");
        String[] newStr = myStr.split(" ");

        for (String s : newStr) {
            if (!s.equals("")) {
                answer.add(s);
            }
        }
        
        if (answer.size() == 0) {
            answer.add("EMPTY");
        }
        
        return answer;
    }
}