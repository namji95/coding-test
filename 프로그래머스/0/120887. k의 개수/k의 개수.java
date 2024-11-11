class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int n = i; n <= j; n++) {
            for (char c : (n+"").toCharArray()) {
                if (Integer.parseInt(String.valueOf(c)) == k) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}