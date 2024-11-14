import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();

        solution2(i);
    }
    
    public static void solution2(int i) {
        if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}