import java.util.*;

public class Main {
    public static void main(String[] args) {
        solution1();
    }

    public static void solution1() {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        int Time = in.nextInt();

        if (m + Time >= 60) {
            h += (m + Time) / 60;
            m = (m + Time) % 60;
        } else {
            m += Time;
        }
        if (h >= 24) {
            h %= 24;
        }

        System.out.println(h + " " + m);
    }
}