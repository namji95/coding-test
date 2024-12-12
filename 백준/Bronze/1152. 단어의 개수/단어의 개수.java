import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
//
//        solution1(s);
//        solution2(s);
//        solution3();
        solution4();
        // The Curious Case of Benjamin Button
    }

//    public static void solution1(String s) {
//        String trim_str = s.trim();
//        String[] split_str = trim_str.split(" ");
//        int cnt = 0;
//
//        for (String str : split_str) {
//            if (!str.isEmpty()) {
//                cnt++;
//            }
//        }
//        System.out.println(cnt);
//    }
//
//    public static void solution2(String s) {
//        StringTokenizer st = new StringTokenizer(s, " ");
//        System.out.println(st.countTokens());
//    }
//
//    public static void solution3() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        System.out.println(st.countTokens());
//    }

    public static void solution4() throws IOException {
        int count = 0;
        int pre_str = 32; // 공백을 의미합니다.
        int str;

        while (true) {
            str = System.in.read();

            // 입력받은 문자가 공백일 때,
            if (str == 32) {
                // 이전의 문자가 공백이 아니면
                if (pre_str != 32) {
                    count++;
                }
            }

            // 입력받은 문자가 개행일 때 ("\n")
            else if (str == 10) {
                // 이전의 문자가 공백이 아니면
                if (pre_str != 32) {
                    count++;
                }
                break;
            }
            pre_str = str;
        }
        System.out.println(count);
    }
}