// import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        for (int i = 0; i < array.length; i++) {
            if (answer[0] < array[i]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        // List<Integer> answer = new ArrayList<Integer>();
        // int max = 0;
        // int idx = 0;
        // for (int i = 0; i < array.length; i++) {
        //     if (max < array[i]) {
        //         max = array[i];
        //         idx = i;
        //     }
        // }
        // answer.add(max);
        // answer.add(idx);
        return answer;
    }
}