import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

//        solution1(x, y);
        solution2(x, y);
    }

//    public static void solution1(int x, int y) {
//        if (x > 0 && y > 0) {
//            System.out.println(1);
//        } else if (x < 0 && y > 0) {
//            System.out.println(2);
//        } else if (x < 0 && y < 0) {
//            System.out.println(3);
//        } else {
//            System.out.println(4);
//        }
//    }

    public static void solution2(int x, int y) {
        if (x > 0) {
            if (y > 0) {
                System.out.println(1);
            } else {
                System.out.println(4);
            }
        } else {
            if (y > 0) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }
    }
}