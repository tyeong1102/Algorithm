import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static int n, d, k, c, s, e, ret;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        arr = new int[n];

        HashSet<Integer> set = new HashSet<>();
        s = 0;
        e = s + k - 1;
        ret = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < n; i++) {
            set = new HashSet<>();

            s = i;
            e = (s + k - 1) % n;

            if (s > e) {
                for (int j = s; j < n; j++) {
                    set.add(arr[j]);
                }

                for (int j = 0; j <= e; j++) {
                    set.add(arr[j]);
                }
            } else {
                for (int j = s; j <= e; j++) {
                    set.add(arr[j]);
                }
            }

            set.add(c);

            ret = Math.max(ret, set.size());
        }

        System.out.println(ret);
    }
}