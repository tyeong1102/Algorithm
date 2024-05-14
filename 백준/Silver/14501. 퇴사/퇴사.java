import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n, ret;
    public static int[][] arr;

    public static void go(int idx, int sum) {
        if (idx >= n) {
            ret = Math.max(ret, sum);
            return;
        }

        ret = Math.max(ret, sum);

        go(idx + 1, sum);
        if (idx + arr[idx][0] <= n) {
            go(idx + arr[idx][0], sum + arr[idx][1]);
        } else {
            go(idx + arr[idx][0], sum);
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        go(0, 0);

        System.out.println(ret);
    }
}