class Solution {
    public StringBuilder solution(String my_string, String overwrite_string, int s) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < s; i++) {
            answer.append(my_string.charAt(i));
        }
        answer.append(overwrite_string);
        if (answer.length() < my_string.length()) {
            answer.append(my_string.substring(answer.length()));
        }
        return answer;
    }
}