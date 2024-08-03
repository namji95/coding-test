class Solution {
    public int[] solution(String my_string) {
        String[] s = my_string.split("");
        String[] alphabet = {
            "A", "B", "C", "D", "E", "F", "G", "H", "I",
            "J", "K", "L", "M", "N", "O", "P", "Q", "R",
            "S", "T", "U", "V", "W", "X", "Y", "Z",
            "a", "b", "c", "d", "e", "f", "g", "h", "i",
            "j", "k", "l", "m", "n", "o", "p", "q", "r",
            "s", "t", "u", "v", "w", "x", "y", "z"};
        int[] answer = new int[52];
        
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (s[i].equals(alphabet[j])) {
                    answer[j] += 1;
                }
            }
        }
        
        return answer;
    }
}