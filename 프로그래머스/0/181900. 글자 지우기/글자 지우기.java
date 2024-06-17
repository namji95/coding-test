class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder(my_string);
        
        for (int i : indices) {
            answer.setCharAt(i, ' ');
        }
        
        return answer.toString().replace(" ", "");
    }
}

// class Solution {
//     public StringBuilder solution(String my_string, int[] indices) {
//         String[] str = my_string.split("");
//         StringBuilder answer = new StringBuilder();
        
//         for (int i = 0; i < indices.length; i++) {
//             str[indices[i]] = "";
//         }
        
//         for (String s : str) {
//             answer.append(s);
//         }
        
//         return answer;
//     }
// }

// class Solution {
//     public String solution(String my_string, int[] indices) {
//         String[] str = my_string.split("");
//         String answer = "";
        
//         for (int i = 0; i < indices.length; i++) {
//             str[indices[i]] = "";
//         }
        
//         for (String s : str) {
//             answer += s;
//         }
        
//         return answer;
//     }
// }