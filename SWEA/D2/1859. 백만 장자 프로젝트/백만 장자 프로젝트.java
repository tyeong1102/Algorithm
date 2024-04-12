import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static int t, n;
    public static long ret;
    public static int[] arr;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= t; test_case++) {
            n = Integer.parseInt(br.readLine());
            arr = new int[n];
            ret = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int max = arr[n - 1];

            for (int i = n - 1; i >= 0; i--) {
                if (max < arr[i]) {
                    max = arr[i];
                } else {
                    ret += max - arr[i];
                }
            }

            StringBuilder sb = new StringBuilder();
            sb.append("#").append(test_case).append(" ").append(ret);

            System.out.println(sb);
        }
    }
}