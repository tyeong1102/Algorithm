import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n, s, ret;
    public static int[] arr;

    public static void go(int depth, int sum) {
        if (depth == n) {
            if (sum == s) {
                ret++;
            }
            return;
        }

        go(depth + 1, sum + arr[depth]);
        go(depth + 1, sum);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        go(0, 0);

        if (s == 0) {
            System.out.println(ret - 1);
        } else {
            System.out.println(ret);
        }
    }
}