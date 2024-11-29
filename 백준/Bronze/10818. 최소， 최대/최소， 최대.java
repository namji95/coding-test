import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        solution1();
//        solution2();
//        solution3();
        solution4();
    }

//    public static void solution1() {
//        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        int[] arr = new int[N];
//        int max = 0;
//        int min = 0;
//
//        for (int i = 0; i < N; i++) {
//            arr[i] = in.nextInt();
//        }
//
//        min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (min > arr[i]) {
//                min = arr[i];
//            }
//            if (max < arr[i]) {
//                max = arr[i];
//            }
//        }
//
//        System.out.println(min + " " + max);
//    }
//
//    public static void solution2() {
//        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        int[] arr = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            arr[i] = in.nextInt();
//        }
//
//        in.close();
//        Arrays.sort(arr);
//        System.out.println(arr[0] + " " + arr[arr.length - 1]);
//    }
//
//    public static void solution3() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine()," ");
//        int index = 0;
//        int[] arr = new int[N];
//
//        while (st.hasMoreTokens()) {
//            arr[index] = Integer.parseInt(st.nextToken());
//            index++;
//        }
//
//        Arrays.sort(arr);
//        System.out.println(arr[0] + " " + arr[arr.length - 1]);
//    }

    public static void solution4() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int max = -1000001;
        int min = 1000001;

        while (st.hasMoreTokens()) {
            int val = Integer.parseInt(st.nextToken());
            if (val > max) {
                max = val;
            }
            if (val < min) {
                min = val;
            }
        }

        System.out.println(min + " " + max);
    }
}