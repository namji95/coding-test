class Solution {
    public StringBuilder solution(String myString, String pat) {
        StringBuilder answer = new StringBuilder();
        
        return answer.append(myString, 0, myString.lastIndexOf(pat) + pat.length());
    }
}

// class Solution {
//     public String solution(String myString, String pat) {
//         String answer = myString.substring(0, myString.lastIndexOf(pat) + pat.length());
        
//         return answer;
//     }
// }