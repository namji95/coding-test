// class Solution {
//     public int solution(int[] date1, int[] date2) {
//         if (date2[0] > date1[0]) {
//             return  1;
//         } else if (date2[0] < date1[0]) {
//             return 0;
//         } else if (date2[1] > date1[1]) {
//             return  1;
//         } else if (date2[1] < date1[1]) {
//             return 0;
//         } else if (date2[2] > date1[2]) {
//             return  1;
//         }

//         return 0;
//     }
// }

// import java.util.*;
// import java.time.*;

// class Solution {
//     public int solution(int[] date1, int[] date2) {
//         int answer = 0;

//         LocalDate dateA = LocalDate.of(date1[0], date1[1], date1[2]);
//         LocalDate dateB = LocalDate.of(date2[0], date2[1], date2[2]);

//         if (dateA.isBefore(dateB)) {
//             answer = 1;
//         }
        
//         return answer;
//     }
// }

// import java.util.*;
// import java.time.*;

// class Solution {
//     public int solution(int[] date1, int[] date2) {
//         int answer = 0;

//         answer = Arrays.compare(date1, date2) < 0 ? 1 : 0;
        
//         return answer;
//     }
// }

import java.util.*;
import java.time.*;

class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;

        for (int i = 0; i < date1.length; i++) {
            if (date2[i] > date1[i]) {
                answer = 1;
                break;
            } else if (date2[i] < date1[i]) {
                break;
            }
        }
        
        return answer;
    }
}