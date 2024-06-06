class Solution {
    public int solution(int a, int b, int c) {
        
        if (a == b && b == c) {
            return (a+b+c) * mathTwoPow(a, b, c) * mathThreePow(a, b, c);
        } else if (a != b && b != c && a != c) {
            return a + b + c;
        } else {
            return (a+b+c) * mathTwoPow(a, b, c);
        }
    }
    
    private static int mathTwoPow(int a, int b, int c) {
        return (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
    }

    private static int mathThreePow(int a, int b, int c) {
        return (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
    }
}