import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int n, m, ret;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        ret = Integer.MAX_VALUE;

        int s = 0;
        int e = 0;

        while (e < n) {
            int num = arr[e] - arr[s];

            if (num < m) {
                e++;
                continue;
            }

            if (num == m) {
                ret = m;
                break;
            }

            ret = Math.min(ret, num);
            s++;
        }

        System.out.println(ret);
    }
}