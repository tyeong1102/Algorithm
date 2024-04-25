import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static int t, n, m;
    public static int[] arr1;
    public static int[] arr2;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= t; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            arr1 = new int[n];
            arr2 = new int[m];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr1[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                arr2[i] = Integer.parseInt(st.nextToken());
            }

            int ret = Integer.MIN_VALUE;

            if (n > m) {
                for (int i = 0; i <= n - m; i++) {
                    int sum = 0;
                    for (int j = 0; j < m; j++) {
                        sum += arr1[i + j] * arr2[j];
                    }

                    ret = Math.max(ret, sum);
                }

            } else if (n < m) {
                for (int i = 0; i <= m - n; i++) {
                    int sum = 0;
                    for (int j = 0; j < n; j++) {
                        sum += arr1[j] * arr2[i + j];
                    }

                    ret = Math.max(ret, sum);
                }
            } else {
                for (int i = 0; i < n; i++) {
                    ret = 0;
                    ret += arr1[i] * arr2[i];
                }
            }

            System.out.println("#" + test_case + " " + ret);
        }
    }
}