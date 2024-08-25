import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int[] before = new int[arr.length];
        int temp = 0;
        int answer = 0;
        
        while (answer == 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    before[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    before[i] = (arr[i] * 2) + 1;
                } else {
                    before[i] = arr[i];
                }
            }
            temp++;
            if (Arrays.equals(arr, before)) {
                answer = temp;
            }
            arr = before.clone();
        }
        return answer - 1;
    }
}