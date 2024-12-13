import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        solution1(str);
    }

    public static void solution1(String str) {
        StringBuilder sb = new StringBuilder(str);

        if (str.contentEquals(sb.reverse())) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}