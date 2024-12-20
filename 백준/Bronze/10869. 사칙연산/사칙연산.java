import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();

        solution1(A, B);
    }

    public static void solution1(int A, int B) {
        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A * B);
        System.out.println(A / B);
        System.out.println(A % B);
    }

    public static void solution2(int A, int B) {
        StringBuilder sb = new StringBuilder();

        sb.append(A + B);
        sb.append("\n");

        sb.append(A - B);
        sb.append("\n");

        sb.append(A * B);
        sb.append("\n");

        sb.append(A / B);
        sb.append("\n");

        sb.append(A % B);

        System.out.println(sb);
    }
}