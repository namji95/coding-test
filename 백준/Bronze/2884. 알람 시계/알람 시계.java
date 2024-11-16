import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int h = in.nextInt();
        int m = in.nextInt();

        solution1(h, m);
    }
    
    public static void solution1 (int h, int m) {
        if(m < 45) {
            h--;
            m = 60 - (45 - m);
            if(h < 0) {
                h = 23;
            }
            System.out.println(h + " " + m);
        }
        else {
            System.out.println(h + " " + (m - 45));
        }
    }
}