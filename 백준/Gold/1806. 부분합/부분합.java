import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n, sum, s, e, ret;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        sum = Integer.parseInt(st.nextToken());
        arr = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        ret = Integer.MAX_VALUE;
        s = 0;
        e = 0;
        int tmp = 0;

        while (s <= n && e <= n) {
            if (tmp < sum) {
                tmp += arr[e];
                e++;
            } else if (tmp >= sum) {
                ret = Math.min(ret, e - s);
                tmp -= arr[s];
                s++;
            }
        }

        if (ret == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(ret);
        }
    }
}