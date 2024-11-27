import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        solution1();
        solution2();
    }

//    public static void solution1() {
//        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        int[] arr = new int[N];
//        int cnt = 0;
//
//        for (int i = 0; i < N; i++) {
//            arr[i] = in.nextInt();
//        }
//        int V = in.nextInt();
//
//        for (int i : arr) {
//            if (i == V) {
//                cnt++;
//            }
//        }
//
//        System.out.println(cnt);
//        
//        in.close();
//    }
    
    public static void solution2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int V = Integer.parseInt(br.readLine());
        
        for (int i : arr) {
            if (i == V) {
                cnt++;
            }
        }
        System.out.println(cnt);
        
        br.close();
        bw.close();
        bw.close();
    }
}