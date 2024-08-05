// import java.math.*;

// class Solution {
//     public String solution(String a, String b) {
//         return (new BigInteger(a).add(new BigInteger(b))) + "";
//     }
// }

// import java.math.*;

// class Solution {
//     public StringBuilder solution(String a, String b) {
//         StringBuilder answer = new StringBuilder();
//         BigInteger A = new BigInteger(a);
//         BigInteger B = new BigInteger(b);
//         answer.append(A.add(B));
        
//         return answer;
//     }
// }

class Solution {
    public StringBuilder solution(String a, String b) {
        StringBuilder answer = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1, j = b.length() - 1;
        
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            answer.append(sum % 10);
            carry = sum / 10;
        }
        
        return answer.reverse();
    }
}