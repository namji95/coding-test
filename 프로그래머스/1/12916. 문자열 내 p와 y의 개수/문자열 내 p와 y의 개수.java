class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] str = s.toLowerCase().split("");
        int count = 0;
        
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("p")) {
                count++;
            } else if (str[i].equals("y")) {
                count--;
            }
        }
        
        answer = count == 0;

        return answer;
    }
}

// class Solution {
//     boolean solution(String s) {
//         boolean answer = true;
//         String[] str = s.toLowerCase().split("");
//         int pNum = 0;
//         int yNum = 0;
        
//         for (int i = 0; i < str.length; i++) {
//             if (str[i].equals("p")) {
//                 pNum++;
//             } else if (str[i].equals("y")) {
//                 yNum++;
//             }
//         }
        
//         answer = pNum == yNum;

//         return answer;
//     }
// }