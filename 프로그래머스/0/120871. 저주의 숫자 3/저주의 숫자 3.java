class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            answer++;   
            while (answer % 3 == 0 || (answer + "").contains("3")) {
                answer++;
            }
        }
        
        return answer;
    }
}

// class Solution {
//     public int solution(int n) {
//         int answer = 0;
        
//         for (int i = 1; i <= n; i++) {
//             answer++;
//             if (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
//                 i--;
//             }
//         }
        
//         return answer;
//     }
// }

// class Solution {
//     public int solution(int n) {
//         int answer = 0;
        
//         for (int i = 1; i <= n; i++) {
//             answer++;
//             if (answer % 3 == 0 || (answer + "").contains(3 + "")) {
//                 n++;
//             }
//         }
        
//         return answer;
//     }
// }

// class Solution {
//     public int solution(int n) {
//            int[] answer = { 1, 2, 4, 5, 7, 8, 10, 11, 14, 16, 17, 19, 20, 22, 25, 26, 28, 29, 40, 41, 44, 46, 47, 49, 50, 52, 55, 56, 58, 59, 61, 62, 64, 65, 67, 68, 70, 71, 74, 76, 77, 79, 80, 82, 85, 86, 88, 89, 91, 92, 94, 95, 97, 98, 100, 101, 104, 106, 107, 109, 110, 112, 115, 116, 118, 119, 121, 122, 124, 125, 127, 128, 140, 142, 145, 146, 148, 149, 151, 152, 154, 155, 157, 158, 160, 161, 164, 166, 167, 169, 170, 172, 175, 176, 178, 179, 181, 182, 184, 185 };
        
//         return answer[n - 1];
//     }
// }