import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner in = new Scanner(System.in);
//        int A = in.nextInt();
//        int B = in.nextInt();

//        solution1(A, B);
//        solution2(A, B);
//        solution3(A, B);
//        solution4();
        solution5();
    }

//    public static void solution1(int A, int B) {
//        if (A > B) {
//            System.out.println(">");
//        } else if (A < B) {
//            System.out.println("<");
//        } else {
//            System.out.println("==");
//        }
//    }
//
//    public static void solution2(int A, int B) {
//        String str = A > B ? ">" : ((A < B) ? "<" : "==");
//        System.out.println(str);
//    }
//
//    public static void solution3(int A, int B) {
//        System.out.println(A > B ? ">" : ((A < B) ? "<" : "=="));
//    }
//
//    public static void solution4() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        StringTokenizer st = new StringTokenizer(str, " ");
//        int A = Integer.parseInt(st.nextToken());
//        int B = Integer.parseInt(st.nextToken());
//
//        System.out.println(A > B ? ">" : ((A < B) ? "<" : "=="));
//    }

    public static void solution5() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);

        System.out.println(A > B ? ">" : ((A < B) ? "<" : "=="));
    }
}