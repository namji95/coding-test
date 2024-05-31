class Solution {
    public int solution(int num, int k) {
        return ("-" + num).indexOf(String.valueOf(k));
        
//         int answer = 0;
//         String[] strNum = String.valueOf(num).split("");

//         for (int i = 0; i < strNum.length; i++) {
//             if (strNum[i].equals(String.valueOf(k))) {
//                 answer = i+1;
//                 break;
//             } else {
//                 answer = -1;
//             }
//         }
//         return answer;
    }
}