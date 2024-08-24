class Solution {
    public long solution(String numbers) {
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        StringBuilder result = new StringBuilder();
        long answer = 0;

        while (!numbers.isEmpty()) {
            for (int i = 0; i < num.length; i++) {
                if (numbers.startsWith(num[i])) {
                    result.append(i);
                    numbers = numbers.substring(num[i].length());
                    break;
                }
            }
        }


        return Long.parseLong(result.toString());
    }
}

// class Solution {
//     public long solution(String numbers) {
//         String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

//         for (int i = 0; i < num.length; i++) {
//             numbers = numbers.replace(num[i], String.valueOf(i));
//         }
        
//         return Long.parseLong(numbers);
//     }
// }

// class Solution {
//     public long solution(String numbers) {
        
//         return Long.parseLong(
//             numbers
//                 .replace("zero", "0")
//                 .replace("one", "1")
//                 .replace("two", "2")
//                 .replace("three", "3")
//                 .replace("four", "4")
//                 .replace("five", "5")
//                 .replace("six", "6")
//                 .replace("seven", "7")
//                 .replace("eight", "8")
//                 .replace("nine", "9")
//        );
//     }
// }