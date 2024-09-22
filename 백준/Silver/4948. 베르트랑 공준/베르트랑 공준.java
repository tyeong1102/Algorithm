import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static int n;
    public static boolean[] prime;

    public static void isPrime(int n) {
        prime = new boolean[2 * n + 1];

        Arrays.fill(prime, true);

        prime[0] = prime[1] = false;

        for (int i = 2; i <= Math.sqrt(2 * n); i++) {
            if (prime[i]) {
                for (int j = i * i; j <= 2 * n; j += i) {
                    prime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        isPrime(123457);

        while (true) {
            n = Integer.parseInt(br.readLine());
            int cnt = 0;

            if (n == 0) {
                break;
            }

            for (int i = n + 1; i <= 2 * n; i++) {
                if (prime[i]) {
                    cnt++;
                }
            }

            sb.append(cnt + "\n");
        }

        System.out.println(sb);

    }
}