import java.util.*;

class Solution {
    public int solution(int[] i1) {
        int i2 = 0;
        Arrays.sort(i1);
        int i3 = i1[i1.length -1];
        for (int i = 0; i< i1.length; i++) {
            i2 += i1[i];
        }
        return i2 - i3 > i3 ? 1 : 2;
    }
}