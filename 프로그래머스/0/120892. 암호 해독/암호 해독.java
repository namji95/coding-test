class Solution {
    public String solution(String cipher, int code) {
        int n = code;
        StringBuilder sb = new StringBuilder();
        String answer = "";
        while (n <= cipher.length()) {
			sb.append(cipher.charAt(n-1));
			n += code;
		}
		// for (int i = code; i <= cipher.length(); i += code) {
		// 	answer += cipher.substring(i-1, i);
		// }
        // for (int i = code-1; i < cipher.length(); i += code) {
		// 	answer += cipher.charAt(i);
		// }
        // return answer;
        return sb.toString();
    }
}