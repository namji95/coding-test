import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String num = in.next();
        char[] c = num.toCharArray();
        int answer = 0;

        for (int i = 0; i < c.length; i++) {
          answer += Integer.parseInt(String.valueOf(c[i]));
        }

        System.out.println(answer);
    }
}