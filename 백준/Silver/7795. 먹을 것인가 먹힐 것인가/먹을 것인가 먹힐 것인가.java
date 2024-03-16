import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int t, x, y, ret;
    public static int[] a, b;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            a = new int[x];
            b = new int[y];

            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < x; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < y; i++) {
                b[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(b);

            ret = 0;
            for (int i = 0; i < x; i++) {
                int s = 0;
                int e = y - 1;
                int idx = 0;

                while (s <= e) {
                    int mid = (s + e) / 2;
                    if (b[mid] < a[i]) {
                        s = mid + 1;
                        idx = mid + 1;
                    } else {
                        e = mid - 1;
                    }
                }
                ret += idx;
            }

            System.out.println(ret);
        }
    }
}