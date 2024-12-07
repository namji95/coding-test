import java.util.*;

public class Main {
    public static void main(String[] args) {
        solution2();
    }

    public static void solution2() {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        StringBuilder sb = new StringBuilder();
        String space = " ";
        String star = "*";

        for (int i = 1; i <= N; i++) {
            sb.append(space.repeat(N-i)).append(star.repeat(i)).append("\n");
        }
        System.out.println(sb);
    }
}