import java.util.*;

public class Main {
    public static void main(String[] args) {
    solution1();
  }

  public static void solution1() {
    Scanner in = new Scanner(System.in);
    int cnt = 0;
    int max = 0;
    int[] arr = {
        in.nextInt(),
        in.nextInt(),
        in.nextInt(),
        in.nextInt(),
        in.nextInt(),
        in.nextInt(),
        in.nextInt(),
        in.nextInt(),
        in.nextInt()
    };
    in.close();
    for (int i = 0; i < arr.length; i++) {
      if (max < arr[i]) {
        cnt = i + 1;
        max = arr[i];
      }
    }
    System.out.println(max + "\n" + cnt);
  }
}