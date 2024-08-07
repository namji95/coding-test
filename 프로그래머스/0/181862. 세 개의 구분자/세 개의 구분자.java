import java.util.*;

class Solution {
    public List solution(String myStr) {
        List<String> answer = new ArrayList<>();
        myStr = myStr.replace("a", " ");
        myStr = myStr.replace("b", " ");
        myStr = myStr.replace("c", " ");
        String[] newStr = myStr.split(" ");

        for (String s : newStr) {
            if (!s.isEmpty()) {
                answer.add(s);
            }
        }
        
        if (answer.isEmpty()) {
            answer.add("EMPTY");
        }
        
        return answer;
    }
}

// class Solution {
//     public String[] solution(String myStr) {
//         myStr = myStr.replaceAll("[abc]+", ",");
//         myStr = myStr.charAt(0) == ',' ? myStr.substring(1) : myStr;
//         myStr = myStr.isEmpty() ? "EMPTY" : myStr;
        
//         return myStr.split(",");
//     }
// }