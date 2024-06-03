class Solution {
    public int solution(String number) {
        String[] splitNum = number.split("");
        int answer = 0;
        
        for (String s : splitNum) {
            answer += Integer.parseInt(s);
        }
        
        return answer % 9;
    }
}