import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int m, n, sum, min;
    public static boolean[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        m = Integer.parseInt(br.readLine());
        n = Integer.parseInt(br.readLine());
        arr = new boolean[n + 1];

        arr[0] = arr[1] = true;

        for (int i = 2; i * i <= n; i++) {
            if (!arr[i]) {
                for (int j = i * i; j <= n; j += i) {
                    arr[j] = true;
                }
            }
        }

        min = Integer.MAX_VALUE;

        for (int i = m; i <= n; i++) {
            if (!arr[i]) {
                sum += i;
                if (min == Integer.MAX_VALUE) {
                    min = i;
                }
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            sb.append(sum).append('\n').append(min);
            System.out.println(sb);
        }


    }
}