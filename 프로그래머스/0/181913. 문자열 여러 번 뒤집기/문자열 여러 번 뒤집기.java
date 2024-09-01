class Solution {
    public StringBuilder solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder(my_string);
        
        for (int i = 0; i < queries.length; i++) {
            StringBuilder front = new StringBuilder();
            StringBuilder back = new StringBuilder();
            StringBuilder reverse = new StringBuilder();
            if (queries[i][0] > 0) {
                front.append(answer.substring(0, queries[i][0]));
            }
            if (queries[i][1] < my_string.length()) {
                back.append(answer.substring(Math.min(queries[i][1] + 1, my_string.length())));
            }
            reverse.append(answer.substring(queries[i][0], Math.min(queries[i][1] + 1, answer.length())));
            reverse.reverse();
            answer.setLength(0);
            answer
                .append(front)
                .append(reverse)
                .append(back);
        }
        
        return answer;
    }
}