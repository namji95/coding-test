import java.util.*;

public class Main {
    public static void main(String[] args) {
        solution1();
    }

    private static void solution1() {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        int cnt = 0;
        
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        int V = in.nextInt();

        for (int i : arr) {
            if (i == V) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}