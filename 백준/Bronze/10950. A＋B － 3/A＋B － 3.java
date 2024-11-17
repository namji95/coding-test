import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int[] arr = new int[T];
        
        for (int i = 0; i < T; i++) {
            int A = in.nextInt();
            int B = in.nextInt();
            
            arr[i] = A + B;
        }
        in.close();

        for(int i = 0; i< arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}