import java.util.*;

class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        int answer = n * n;
        Set<String> danger = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    danger.add(i + "" + j);
                    if (i - 1 >= 0 && j - 1 >= 0) {
                        danger.add((i - 1) + "" + (j - 1)); // 좌상
                    }
                    if (i - 1 >= 0) {
                        danger.add((i - 1) + "" + j); // 상
                    }
                    if (i - 1 >= 0 && j + 1 < n) {
                        danger.add((i - 1) + "" + (j + 1)); // 우상
                    }
                    if (j - 1 >= 0) {
                        danger.add(i + "" + (j - 1)); // 좌
                    }
                    if (j + 1 < n) {
                        danger.add(i + "" + (j + 1)); // 우
                    }
                    if (i + 1 < n && j - 1 >= 0) {
                        danger.add((i + 1) + "" + (j - 1)); // 좌하
                    }
                    if (i + 1 < n) {
                        danger.add((i + 1) + "" + j); // 하
                    }
                    if (i + 1 < n && j + 1 < n) {
                        danger.add((i + 1) + "" + (j + 1)); // 우하
                    }
                }
            }
        }
        if (answer - danger.size() > 0) {
            answer = answer - danger.size();
        } else {
            answer = 0;
        }
        
        return answer;
    }
}