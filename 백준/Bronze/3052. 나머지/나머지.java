import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        solution4();
    }

    public static void solution4() throws IOException {
        boolean[] arr = new boolean[42];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            arr[Integer.parseInt(br.readLine()) % 42] = true;
        }

        int count = 0;
        for (boolean bool : arr) {
            if (bool) {
                count++;
            }
        }

        System.out.println(count);
    }
}