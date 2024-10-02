// import java.util.*;

// class Solution {
//     public int solution(int a, int b) {
        
//         int fraction = fraction(a, b);
//         List<Integer> primeFactors = getPrimeFactors(fraction);
        
//         return checkDecimalType(primeFactors);
//     }
    
//     // 최대공약수
//     private static int gcd(int a, int b) {
//         while (b != 0) {
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a;
//     }

//     // 기약분수에서 분모만 반환
//     private static int fraction(int a, int b) {
//         int numerator = a;
//         int denominator = b;

//         int gcdValue = gcd(numerator, denominator);

//         // 분자, 분모 기약분수 만들기
//         denominator /= gcdValue;

//         return denominator;
//     }

//     // 소인수
//     private static List<Integer> getPrimeFactors(int fraction) {
//         List<Integer> primeFactors = new ArrayList<>();

//         // 2로 나누어 떨어질 때까지 나누기
//         for (int i = 2; i <= fraction; i++) {
//             while (fraction % i == 0) {
//                 primeFactors.add(i);
//                 fraction /= i;
//             }
//         }
//         return primeFactors;
//     }

//     // 무한소수 유한소수 판별
//     private static int checkDecimalType(List<Integer> primeFactors) {
//         int answer = 1;
//         for (int i : primeFactors) {
//             if (i != 2 && i != 5) {
//                 answer = 2;
//                 break;
//             }
//         }

//         return answer;
//     }
// }

// class Solution {
//     public int solution(int a, int b) {
//         b /= gcd(a, b);
//         while (b != 1) {
//             if (b % 5 == 0) {
//                 b /= 5;
//                 continue;
//             }
//             if (b % 2 == 0) {
//                 b /= 2;
//                 continue;
//             }
//             return 2;
//         }
//         return 1;
//     }

//     private int gcd(int a, int b) {
//         if (b == 0) {
//             return a;
//         }
//         return gcd(b, a % b);
//     }
// }

// class Solution {
//     public int solution(int a, int b) {
//         int answer = 0;

//         for (;b%2 == 0;) {
//             b = b/2;
//         }
//         for (;b%5 == 0;) {
//             b = b/5;
//         }

//         if ((a/(double)b)%1 == 0) {
//             answer = 1;
//         } else {
//             answer = 2;
//         }

//         return answer;
//     }
// }

class Solution {
    public int solution(int a, int b) {
        int answer = ((a*320000)%b == 0) ? 1 : 2;
        return answer;
    }
}