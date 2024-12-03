import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        solution3();
    }
    
    public static void solution3() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] c = s.toCharArray();

        System.out.println(c.length);
    }
}