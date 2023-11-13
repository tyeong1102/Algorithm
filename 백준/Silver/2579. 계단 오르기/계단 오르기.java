import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int n;
    public static int[] arr;
    public static int[][] d;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n + 4];
        d = new int[n + 4][3];

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        if (n == 1) {
            System.out.println(arr[1]);
            return;
        }

        d[1][1] = arr[1];
        d[1][2] = 0;
        d[2][1] = arr[2];
        d[2][2] = arr[1] + arr[2];
        for (int i = 3; i <= n; i++) {
            d[i][1] = Math.max(d[i - 2][1], d[i - 2][2]) + arr[i];
            d[i][2] = d[i - 1][1] + arr[i];
        }

        int ret = Math.max(d[n][1], d[n][2]);

        System.out.println(ret);
    }
}