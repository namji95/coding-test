class Solution {
    public int solution(String myString, String pat) {
        String s = "";
        for (int i = 0; i < myString.length(); i++) {
            if (myString.substring(i, i+1).equals("A")) {
                s += "B";
            } else {
                s += "A";
            }
        }
        return s.contains(pat) ? 1 : 0;
    }
}