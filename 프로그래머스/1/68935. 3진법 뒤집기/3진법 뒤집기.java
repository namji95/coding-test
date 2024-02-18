class Solution {
    public int solution(int n) {
        String threeN = Integer.toString(n, 3);
        StringBuilder reverse = new StringBuilder();
        for (int i = threeN.length() -1; i >= 0; i--) {
            reverse.append(threeN.charAt(i));
        }
        int newN = Integer.parseInt(String.valueOf(reverse), 3);
        return newN;
    }
}