class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] str = (order + "").split("");
        
        for (String s : str) {
            if (s.equals("3") || s.equals("6") || s.equals("9")) {
                answer++;
            }
        }
        
        return answer;
    }
}