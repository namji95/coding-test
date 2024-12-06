import java.util.*;

public class Main {
    public static void main(String[] args) {
        solution1();
    }

    public static void solution1() {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}