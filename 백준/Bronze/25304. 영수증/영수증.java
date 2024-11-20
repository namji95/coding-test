import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    //        solution1();
        solution2();
    }

//    public static void solution1() {
//        Scanner in = new Scanner(System.in);
//        int x = in.nextInt();
//        int n = in.nextInt();
//        int result = 0;
//        String answer = "";
//
//        for (int i = 0; i < n; i++) {
//            int a = in.nextInt();
//            int b = in.nextInt();
//            result += a * b;
//        }
//        answer = result == x ? "Yes" : "No";
//
//        System.out.println(answer);
//    }

    public static void solution2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            result += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }

        System.out.println(result == x ? "Yes" : "No");
    }
}