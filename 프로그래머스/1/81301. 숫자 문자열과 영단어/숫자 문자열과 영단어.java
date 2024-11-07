// class Solution {
//     public int solution(String s) {
//         String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
//         for (int i = 0; i < numbers.length; i++) {
//             s = s.replaceAll(numbers[i], String.valueOf(i));
//         }
        
//         return Integer.parseInt(s);
//     }
// }

// class Solution {
//     public int solution(String s) {
//         String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
//         String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};

//         for(int i=0; i<10; i++){
//             s = s.replaceAll(alphabets[i],digits[i]);
//         }
        
//         return Integer.parseInt(s);
//     }
// }

class Solution {
    public int solution(String s) {
        String[][] mapArr = {
                {"0", "zero"},
                {"1", "one"},
                {"2", "two"},
                {"3", "three"},
                {"4", "four"},
                {"5", "five"},
                {"6", "six"},
                {"7", "seven"},
                {"8", "eight"},
                {"9", "nine"} };

        for(String[] map : mapArr){
            s = s.replace(map[1], map[0]);
        }
        
        return Integer.parseInt(s);
    }
}