import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        
//        solution1(A, B);
//        solution2(A, B);
        solution3(A, B);
    }

//    public static void solution1(int A, int B) {
//        if (A > B) {
//            System.out.println(">");
//        } else if (A < B) {
//            System.out.println("<");
//        } else {
//            System.out.println("==");
//        }
//    }
//
//    public static void solution2(int A, int B) {
//        String str = A > B ? ">" : ((A < B) ? "<" : "==");
//        System.out.println(str);
//    }

    public static void solution3(int A, int B) {
        System.out.println(A > B ? ">" : ((A < B) ? "<" : "=="));
    }
}