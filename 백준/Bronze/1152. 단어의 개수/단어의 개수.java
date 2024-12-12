import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        solution2(s);
    }

    public static void solution2(String s) {
        StringTokenizer st = new StringTokenizer(s, " ");
        System.out.println(st.countTokens());
    }
}