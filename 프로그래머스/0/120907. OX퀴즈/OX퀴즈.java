// class Solution {
//     public String[] solution(String[] quiz) {
//         String[] answer = new String[quiz.length];
        
//         for (int i = 0; i < quiz.length; i++) {
//             String[] str = quiz[i].split(" ");
//             int first = Integer.parseInt(str[0]);
//             int second = Integer.parseInt(str[2]);
//             int third = Integer.parseInt(str[4]);
//             if ((quiz[i].contains(" + ") && first + second == third) ||
//                     (quiz[i].contains(" - ") && first - second == third)) {
//                 answer[i] = "O";
//             } else {
//                 answer[i] = "X";
//             }
//         }
        
//         return answer;
//     }
// }

class Solution {
    public String[] solution(String[] quiz) {
        
        for(int i=0; i<quiz.length; i++){
            String[] text = quiz[i].split(" ");
            int result = Integer.parseInt(text[0]) +
                    (Integer.parseInt(text[2]) * (text[1].equals("+") ? 1:-1));
            quiz[i] = result == Integer.parseInt(text[4])? "O": "X";
        }
        
        return quiz;
    }
}