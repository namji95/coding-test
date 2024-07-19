class Solution {
    public int solution(int[] array) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        for (int j : array) {
            sb.append(j);
        }
        for (String s : sb.toString().split("")) {
            if (Integer.parseInt(s) == 7) {
                answer++;
            }
        }
        return answer;
    }
}