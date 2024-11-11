// class Solution {
//     public int solution(int i, int j, int k) {
//         int answer = 0;
        
//         for (int n = i; n <= j; n++) {
//             for (char c : (n+"").toCharArray()) {
//                 if (Integer.parseInt(String.valueOf(c)) == k) {
//                     answer++;
//                 }
//             }
//         }
        
//         return answer;
//     }
// }

// class Solution {
//     public int solution(int i, int j, int k) {
//         StringBuilder str = new StringBuilder();
        
//         for (int n = i; n <= j; n++) {
//             str.append(n);
//         }
        
//         return str.length() - str.toString().replace(k+"", "").length();
//     }
// }

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int n = i; n <= j; n++) {
            int temp = n;
            while (temp != 0) {
                if (temp % 10 == k) {
                    answer++;
                }
                temp /= 10;
            }
        }
        
        return answer;
    }
}