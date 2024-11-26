import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        solution1();
        solution2();
    }

//    public static void solution1() {
//        Scanner in = new Scanner(System.in);
//
//        while (in.hasNextInt()) {
//            int A = in.nextInt();
//            int B = in.nextInt();
//            System.out.println(A + B);
//        }
//        in.close();
//    }

    public static void solution2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;

        while ((str=br.readLine()) != null) {
            st = new StringTokenizer(str, " ");
            int A  = Integer.parseInt(st.nextToken());
            int B  = Integer.parseInt(st.nextToken());
            sb.append(A+B).append("\n");
        }
        System.out.println(sb);
    }
}