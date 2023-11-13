import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int t, n;
    public static int[] d;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            d = new int[n + 2];

            d[0] = 1;
            d[1] = 1;
            d[2] = 2;
            for (int i = 3; i <= n; i++) {
                d[i] = d[i - 1] + d[i - 2] + d[i - 3];
            }

            System.out.println(d[n]);
        }

    }
}