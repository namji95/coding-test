import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        solution1(s);
    }

    public static void solution1(String s) {
        String trim_str = s.trim();
        String[] split_str = trim_str.split(" ");
        int cnt = 0;

        for (String str : split_str) {
            if (!str.isEmpty()) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}