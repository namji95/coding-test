import java.util.*;

public class Main {
    public static void main(String[] args) {
        solution1();
    }

    public static void solution1() {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        StringBuilder sb = new StringBuilder();
        String space = " ";
        String star = "*";

        for (int i = 1; i <= N; i++) {
            for (int j = N-i; j > 0; j--) {
                sb.append(space);
            }
            for (int k = i; k > 0; k--) {
                sb.append(star);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}