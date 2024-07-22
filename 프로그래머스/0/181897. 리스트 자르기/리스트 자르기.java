import java.util.*;

// class Solution {
//     public List solution(int n, int[] slicer, int[] num_list) {
//         List<Integer> answer = new ArrayList<>();
//         int a = slicer[0];
//         int b = slicer[1];
//         int c = slicer[2];

//         if (n == 1) {
//             for (int i = 0; i <= b; i++) {
//                 answer.add(num_list[i]);
//             }
//         } else if (n == 2) {
//             for (int i = a; i < num_list.length; i++) {
//                 answer.add(num_list[i]);
//             }
//         } else if (n == 3) {
//             for (int i = a; i <= b; i++) {
//                 answer.add(num_list[i]);
//             }
//         } else {
//             for (int i = a; i <= b; i+=c) {
//                 answer.add(num_list[i]);
//             }
//         }
//         return answer;
//     }
// }

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> arr = new ArrayList<>();
        int[] answer = {};
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        if (n == 1) {
            for (int i = 0; i <= b; i++) {
                arr.add(num_list[i]);
            }
        } else if (n == 2) {
            for (int i = a; i < num_list.length; i++) {
                arr.add(num_list[i]);
            }
        } else if (n == 3) {
            for (int i = a; i <= b; i++) {
                arr.add(num_list[i]);
            }
        } else {
            for (int i = a; i <= b; i+=c) {
                arr.add(num_list[i]);
            }
        }
        
        answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        
        return answer;
    }
}