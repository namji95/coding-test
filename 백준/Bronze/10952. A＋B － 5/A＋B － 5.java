import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        solution1();
//        solution2();
        solution3();
    }

//    public static void solution1() {
//        Scanner in = new Scanner(System.in);
//
//
//        while (true) {
//            int A = in.nextInt();
//            int B = in.nextInt();
//            if (A == 0 && B == 0) {
//                break;
//            }
//            System.out.println(A + B);
//        }
//    }

//    public static void solution2() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        StringBuilder sb = new StringBuilder();
//
//        while(true) {
//            st = new StringTokenizer(br.readLine(), " ");
//            int A = Integer.parseInt(st.nextToken());
//            int B = Integer.parseInt(st.nextToken());
//
//            if (A == 0 && B == 0) {
//                break;
//            }
//
//            sb.append(A + B).append("\n");
//        }
//
//        System.out.println(sb);
//    }

    public static void solution3() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();
            int A = str.charAt(0) - 48;
            int B = str.charAt(2) - 48;

            if (A == 0 && B == 0) {
                break;
            }

            sb.append(A + B).append("\n");
        }

        System.out.println(sb);
    }
}