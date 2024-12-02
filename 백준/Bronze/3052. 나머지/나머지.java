import java.util.*;

public class Main {
    public static void main(String[] args) {
        solution2();
    }
    
    public static void solution2() {
        Scanner in = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < 10; i++) {
            set.add(in.nextInt() % 42);
        }
        
        System.out.println(set.size());
    }
}