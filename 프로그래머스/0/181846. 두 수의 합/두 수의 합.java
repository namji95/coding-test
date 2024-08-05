// import java.math.*;

// class Solution {
//     public String solution(String a, String b) {
//         return (new BigInteger(a).add(new BigInteger(b))) + "";
//     }
// }

import java.math.*;

class Solution {
    public StringBuilder solution(String a, String b) {
        StringBuilder answer = new StringBuilder();
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        answer.append(A.add(B));
        
        return answer;
    }
}