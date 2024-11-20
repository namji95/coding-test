import java.util.*;

public class Main {
    public static void main(String[] args) {
        solution1();
    }

    public static void solution1() {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        int result = 0;
        String answer = "";

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            result += a * b;
        }
        answer = result == x ? "Yes" : "No";

        System.out.println(answer);
    }
}