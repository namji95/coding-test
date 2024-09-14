class Solution {
    public String solution(String s, int n) {
        char[] c = s.toCharArray();
        
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                c[i] = ' ';
            } else if (c[i] + n > 'z') {
                c[i] = (char) (96 + (n - (122 - c[i])));
            } else if (c[i] + n > 'Z' && c[i] <= 'Z') {
                c[i] = (char) (64 + (n - (90 - c[i])));
            } else {
                c[i] = (char) (c[i] + n);
            }
        }
        
        return String.valueOf(c);
    }
}