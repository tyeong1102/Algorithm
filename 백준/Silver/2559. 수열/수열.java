import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n, k, s, e, ret;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[n];
        ret = Integer.MIN_VALUE;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        s = 0;
        e = s + k - 1;

        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for (int j = s; j <= e; j++) {
                sum += arr[j];
            }
            s++;
            e++;

            ret = Math.max(ret, sum);
        }

        System.out.println(ret);

    }
}