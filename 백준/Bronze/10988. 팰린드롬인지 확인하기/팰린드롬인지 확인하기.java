import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        solution2(str);
    }

    public static void solution2(String str) {
        StringBuilder tmp = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            tmp.append(str.charAt(i));
        }
        if (tmp.toString().equals(str)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}