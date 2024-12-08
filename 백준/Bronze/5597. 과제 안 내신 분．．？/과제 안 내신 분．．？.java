import java.util.*;

public class Main {
    public static void main(String[] args) {
        solution1();
    }

    public static void solution1() {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[31];

        for (int i = 1; i < 29; i++) {
            int existence = in.nextInt();
            nums[existence] = 1;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != 1) {
                System.out.println(i);
            }
        }
    }
}