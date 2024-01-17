import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int m, n;
    public static boolean[] arr;

    public static void isPrime(int m, int n) {
        arr = new boolean[n + 1];

        arr[0] = arr[1] = true;

        for (int i = 2; i * i <= n; i++) {
            if (!arr[i]) {
                for (int j = i * i; j <= n; j += i) {
                    arr[j] = true;
                }
            }
        }

        for (int i = m; i <= n; i++) {
            if (!arr[i]) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        isPrime(m, n);
    }
}