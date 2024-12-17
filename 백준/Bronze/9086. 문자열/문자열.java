import java.util.*;

public class Main {
    public static void main(String[] args) {
        solution1();
    }

    public static void solution1() {
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        in.nextLine();

        for (int i = 0; i < cnt; i++) {
            String str = in.nextLine();

            String first_str = String.valueOf(str.charAt(0));
            String last_str = String.valueOf(str.charAt(str.length() - 1));

            System.out.println(first_str + last_str);
        }
    }
}