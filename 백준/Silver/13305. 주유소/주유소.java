import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n;
    public static long ret;
    public static long[] dist, price;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        price = new long[n];
        dist = new long[n - 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n - 1; i++) {
            dist[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }

        long min = Long.MAX_VALUE;

        for (int i = 0; i < n - 1; i++) {
            if (price[i] <= min) {
                min = price[i];
                ret += price[i] * dist[i];
            } else {
                ret += min * dist[i];
            }
        }

        System.out.println(ret);
    }
}