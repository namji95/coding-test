class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] num = {
            "zero", "one", "two", "three", "four", 
            "five", "six", "seven", "eight", "nine"};
        StringBuilder result = new StringBuilder();
        
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