class Solution {
    public int solution(int n) {
        
        String third = Integer.toString(n,3);
        StringBuilder sb = new StringBuilder(third);
        String reverse = sb.reverse().toString();
        
        return Integer.parseInt(reverse, 3);

//        String threeN = Integer.toString(n, 3);
//        StringBuilder reverse = new StringBuilder();
//        for (int i = threeN.length() -1; i >= 0; i--) {
//            reverse.append(threeN.charAt(i));
//        }
//        int newN = Integer.parseInt(String.valueOf(reverse), 3);
//        return newN;

//        String a = "";
//
//        while (n > 0) {
//            a = (n % 3) + a;
//            n /= 3;
//        }
//        a = new StringBuilder(a).reverse().toString();
//        return Integer.parseInt(a, 3);
    }
}