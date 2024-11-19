import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        solution1(n);
        // solution2(n);
    }
    
    public static void solution1(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            answer += i;
        }

        System.out.println(answer);
    }
    
    //    public static void solution2(int n) {
//        int answer = 0;
//
//        while (n > 0 && (answer += n--) > 0);
//
//        System.out.println(answer);
//    }
}