import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n, k, odd, ret;
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

        int s = 0;
        int e = 0;

        while (e < n) {
            if (odd < k) {
                if (arr[e] % 2 == 1) {
                    odd++;
                }
                e++;
                ret = Math.max(ret, e - s - odd);
            } else if (arr[e] % 2 == 0) {
                e++;
                ret = Math.max(ret, e - s - odd);
            } else {
                if (arr[s] % 2 == 1) {
                    odd--;
                }
                s++;
            }
        }

        System.out.println(ret);
    }
}