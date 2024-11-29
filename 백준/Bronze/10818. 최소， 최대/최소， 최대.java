import java.util.*;

public class Main {
    public static void main(String[] args) {
        solution1();
    }

    public static void solution1() {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        int max = 0;
        int min = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        min = arr[0];
        max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(min + " " + max);
    }
}