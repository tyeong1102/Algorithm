import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n, k, s, e, ret;
    public static int[] arr, num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[n];
        num = new int[100001];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        s = 0;
        e = s;
        ret = Integer.MIN_VALUE;

        while (e < n) {

            while (e < n && num[arr[e]] + 1 <= k) {
                num[arr[e]]++;
                e++;
            }

            int len = e - s;
            ret = Math.max(ret, len);

            num[arr[s]]--;
            s++;
        }

        System.out.println(ret);
    }
}