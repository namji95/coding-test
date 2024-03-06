import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<String, Integer> keyCount = new HashMap<>();
        
        for (int i = 0; i < keymap.length; i++) {
          String[] arr = keymap[i].split("");
            
          for (int j = 0; j < arr.length; j++) {
            if (!keyCount.containsKey(arr[j])) {
              keyCount.put(arr[j], j + 1);
              continue;
            }
    
            if (keyCount.get(arr[j]) > j + 1) {
              keyCount.put(arr[j], j + 1);
            }
          }
        }
    
        for (int i = 0; i < targets.length; i++) {
          String[] arr = targets[i].split("");
          for (int j = 0; j < arr.length; j++) {
            if (!keyCount.containsKey(arr[j])) {
              answer[i] = -1;
              break;
            } else {
              answer[i] += keyCount.get(arr[j]);
            }
          }
        }
        return answer;
    }
}