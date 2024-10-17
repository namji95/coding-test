import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;

        for (int i = 0; i < dots.length; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                for (int k = 0; k < dots.length; k++) {
                    for (int l = k + 1; l < dots.length; l++) {
                        if (i != k && i != l && j != k && j != l) {
                            if ((dots[j][1] - dots[i][1]) * (dots[l][0] - dots[k][0]) == (dots[l][1] - dots[k][1]) * (dots[j][0] - dots[i][0])) {
                                answer = 1;
                                break;
                            }
                        }
                    }
                    if (answer == 1) {
                        break;
                    }
                }
                if (answer == 1) {
                    break;
                }
            }
            if (answer == 1) {
                break;
            }
        }
        
        return answer;
    }
}