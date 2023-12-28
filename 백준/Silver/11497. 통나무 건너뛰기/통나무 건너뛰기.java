import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int t, n, s, e, ret;
    public static int[] arr1, arr2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine());
            arr1 = new int[n];
            arr2 = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                arr1[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr1);
            s = 0;
            e = n - 1;

            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    arr2[e] = arr1[j];
                    e--;
                } else {
                    arr2[s] = arr1[j];
                    s++;
                }
            }

            ret = Math.abs(arr2[0] - arr2[n - 1]);

            for (int j = 1; j < n; j++) {
                ret =Math.max(ret, Math.abs(arr2[j - 1] - arr2[j]));
            }

            System.out.println(ret);
        }
    }
}