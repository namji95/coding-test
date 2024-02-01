class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replace("A", "a").replace("B", "A").replace("a", "B");
        return myString.contains(pat) ? 1 : 0;
        // String s = "";
        // for (int i = 0; i < myString.length(); i++) {
        //     if (myString.substring(i, i+1).equals("A")) {
        //         s += "B";
        //     } else {
        //         s += "A";
        //     }
        // }
        // return s.contains(pat) ? 1 : 0;
    }
}