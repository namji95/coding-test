import java.util.*;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        List<String> list = new ArrayList<>(List.of(my_string.split("")));
        Collections.swap(list, num1, num2);
        return String.join("", list);
        // String answer = "";
        // char[] arr = my_string.toCharArray();
        // arr[num1] = my_string.charAt(num2);
        // arr[num2] = my_string.charAt(num1);
        // return answer = String.valueOf(arr);
    }
}