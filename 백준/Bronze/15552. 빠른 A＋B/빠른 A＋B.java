import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        solution1();
        solution2();
    }

//    // bufferedWriter
//    public static void solution1() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st;
//        int T = Integer.parseInt(br.readLine());
//
//        for (int i = 0; i < T; i++) {
//            st = new StringTokenizer(br.readLine());
//            int A = Integer.parseInt(st.nextToken());
//            int B = Integer.parseInt(st.nextToken());
//            bw.write((A + B) + "\n");
//        }
//
//        bw.flush();
//        bw.close();
//    }

    // StringBuilder
    public static void solution2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append("\n");
        }
        br.close();

        System.out.println(sb);
    }
}