import java.util.*;

public class Main {
    public static void main(String[] args) {
        solution1();
    }

    public static void solution1() {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int X = in.nextInt();
        int[] arr = new int[N];
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        in.close();

        for (int j : arr) {
            if (j < X) {
                answer.append(j).append(" ");
            }
        }
        
        System.out.println(answer);
    }
}