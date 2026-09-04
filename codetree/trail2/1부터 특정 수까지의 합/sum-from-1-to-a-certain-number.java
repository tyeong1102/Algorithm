import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int n, ret;

    public static void sum(int n) {
        for (int i = 1; i <= n; i++) {
            ret += i;
        }

        ret /= 10;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        sum(n);

        System.out.println(ret);
    }
}