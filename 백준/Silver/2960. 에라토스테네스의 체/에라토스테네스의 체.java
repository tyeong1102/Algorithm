import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n, k;
    public static int[] arr;

    public static void isPrime(int n, int k) {
        arr = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            arr[i] = i;
        }
        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) continue;

            for (int j = i; j <= n; j += i) {
                if (arr[j] != 0) {
                    arr[j] = 0;
                    k--;
                    if (k == 0) {
                        System.out.print(j);
                        return;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        isPrime(n, k);
    }
}