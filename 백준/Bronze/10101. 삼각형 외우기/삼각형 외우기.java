import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int a, b, c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());

        if (a == 60 && b == 60 && c == 60) {
            System.out.println("Equilateral");
        } else if (a + b + c == 180) {
            if (a == b || a == c || b == c) {
                System.out.println("Isosceles");
            }
            if (a != b && a != c && b != c) {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }
    }
}