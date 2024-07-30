// class Solution {
//     public int solution(int[] numbers, int k) {
//         return numbers[2 * (k - 1) % numbers.length];
//     }
// }

class Solution {
    public int solution(int[] numbers, int k) {
        return 2 * (k - 1) % numbers.length + 1;
    }
}