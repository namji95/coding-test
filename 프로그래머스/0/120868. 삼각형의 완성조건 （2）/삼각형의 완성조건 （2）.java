class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int start = Math.max(sides[0], sides[1]) - Math.min(sides[0], sides[1]);
        int end = Math.max(sides[0], sides[1]) + Math.min(sides[0], sides[1]);
        
        for (int i = start + 1; i < end; i++) {
            answer++;
        }
        
        return answer;
    }
}