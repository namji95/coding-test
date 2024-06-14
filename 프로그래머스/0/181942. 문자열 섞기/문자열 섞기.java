class Solution {
    public StringBuilder solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();
        String[] s1 = str1.split("");
        String[] s2 = str2.split(""); 
        
        for (int i = 0; i < s1.length; i++) {
            answer.append(s1[i]);
            answer.append(s2[i]);
        }
        
        
        return answer;
    }
}

// class Solution {
//     public StringBuilder solution(String str1, String str2) {
//         StringBuilder answer = new StringBuilder();
        
//         for (int i = 0; i < str1.length(); i++) {
//             answer.append(str1.charAt(i));
//             answer.append(str2.charAt(i));
//         }
        
//         return answer;
//     }
// }