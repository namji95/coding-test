import java.util.*;

public class Main {
    public static void main(String[] args) {
        solution1();
    }

    public static void solution1() {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int i = 1; i <= T; i++) {
            int A = in.nextInt();
            int B = in.nextInt();
            System.out.println("Case #" + i + ": " + (A + B));
        }
  }
}