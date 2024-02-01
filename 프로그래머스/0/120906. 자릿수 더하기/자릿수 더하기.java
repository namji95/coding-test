class Solution {
    public int solution(int n) {
        String s = n + "";
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            answer += Integer.parseInt(s.substring(i, i+1));
        }
        
        // while(n>0){
        //     answer+=n%10;
        //     n/=10;
        // }
        
        return answer;
    }
}