import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int one = in.nextInt();
        int two = in.nextInt();
        int three = in.nextInt();

        solution1(one, two, three);
    }
    
    public static void solution1(int one, int two, int three) {
        int answer = 0;
        if (one == two && one == three) {
            answer = 10000 + one * 1000;
        } else if (one == two || one == three) {
            answer = 1000 + one * 100;
        } else if (two == three) {
            answer = 1000 + two * 100;
        } else {
            int max = Math.max(one, Math.max(two, three));
            answer = max * 100;
        }

        System.out.println(answer);
    }
}