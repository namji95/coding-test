class Solution {
    public int[] solution(String[] wallpaper) {
        
        int min_x=Integer.MAX_VALUE;
        int min_y=Integer.MAX_VALUE;
        int max_x=-1;
        int max_y=-1;
        for(int i=0;i<wallpaper.length;i++){
            for(int j=0;j<wallpaper[0].length();j++){
                if(wallpaper[i].charAt(j)=='#'){
                    min_x = min_x>i ? i : min_x;
                    min_y = min_y>j ? j : min_y;
                    max_x = max_x<i ? i : max_x;
                    max_y = max_y<j ? j : max_y;
                }
            }
        }

        int[] answer = {min_x,min_y,max_x+1,max_y+1};
        return answer;
        
//         int[] answer = new int[] {
//             Integer.MAX_VALUE,
//             Integer.MAX_VALUE,
//             Integer.MIN_VALUE,
//             Integer.MIN_VALUE
//         };
        
//         for (int i = 0; i < wallpaper.length; i++) {
//             for (int j = 0; j < wallpaper[i].length(); j++) {
//                 if (wallpaper[i].charAt(j) == '#') {
//                     answer[0] = Math.min(i, answer[0]);
//                     answer[1] = Math.min(j, answer[1]);
//                     answer[2] = Math.max(i + 1, answer[2]);
//                     answer[3] = Math.max(j + 1, answer[3]);
//                 }
//             }
//         }
        
//         return answer;
        
        // int top = Integer.MAX_VALUE;
        // int left = Integer.MAX_VALUE;
        // int bottom = Integer.MIN_VALUE;
        // int right = Integer.MIN_VALUE;
        // for (int i = 0; i < wallpaper.length; i++) {
        //     for (int j = 0; j < wallpaper[i].length(); j++) {
        //         if (wall[i].charAt(j) == '#') {
        //             top = Math.min(i, top);
        //             left = Math.min(j, left);
        //             bottom = Math.max(i + 1, bottom);
        //             right = Math.max(j + 1, right);
        //         }
        //     }
        // }
        // return new int[]{top, left, bottom, right};
    }
}