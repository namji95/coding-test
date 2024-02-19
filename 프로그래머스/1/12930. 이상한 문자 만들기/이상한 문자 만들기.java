class Solution {
    public String solution(String s) {
//        String answer = "";
//        String[] ss = s.split("");
        char[] c = s.toCharArray();
        int idx = 0;
        
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                idx = 0;
            } else {
                c[i] = (idx++ % 2 == 0 ? Character.toUpperCase(c[i]) : Character.toLowerCase(c[i]));
            }
        }
        
        return String.valueOf(c);
        
//        for (String str : ss) {
//            idx = str.contains(" ") ? 0 : idx + 1;
//            answer += idx % 2 == 0 ? str.toLowerCase() : str.toUpperCase();
//        }
        
//        for (int i = 0; i < ss.length; i++) {
//            if (ss[i].equals(" ")) {
//                idx = 0;
//            } else if (idx % 2 == 0) {
//                ss[i] = ss[i].toUpperCase();
//                idx++;
//            } else if (idx % 2 != 0) {
//                ss[i] = ss[i].toLowerCase();
//                idx++;
//            }
//            answer += ss[i];
//        }
//        return answer;
    }
}