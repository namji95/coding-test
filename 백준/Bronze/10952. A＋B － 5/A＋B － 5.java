import java.util.*;

public class Main {
    public static void main(String[] args) {
        solution1();
    }

    public static void solution1() {
        Scanner in = new Scanner(System.in);


        while (true) {
            int A = in.nextInt();
            int B = in.nextInt();
            if (A + B != 0) {
                System.out.println(A + B);
                continue;
            } else {
                break;
            }
        }
    }
}