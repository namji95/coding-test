import java.util.*;

public class Main {
    public static void main(String[] args) {
        int B = 42;
        
        solution1(B);
    }


    public static void solution1(int B) {
        Scanner in = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int A  = in.nextInt();
            set.add(A % B);
        }

        System.out.println(set.size());
    }
}