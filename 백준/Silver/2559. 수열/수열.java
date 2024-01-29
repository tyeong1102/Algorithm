import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n, k, s, e, max;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        s = 0;
        e = s + k - 1;
        max = Integer.MIN_VALUE;

        for (int i = 0; i <= n - k; i++) {
            int tmp = 0;
            for (int j = s; j <= e; j++) {
                tmp += arr[j];
            }
            max = Math.max(max, tmp);
            s++;
            e++;
        }

        System.out.println(max);
    }
}