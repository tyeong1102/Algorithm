import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static int n, ret;
    public static int[] arr;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int test_case = 1; test_case <= 10; test_case++) {
            StringBuilder sb = new StringBuilder();
            n = Integer.parseInt(br.readLine());
            arr = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            ret = 0;

            for (int i = 2; i < n - 2; i++) {
                int cnt = Integer.MAX_VALUE;
                for (int j = i - 2; j < i; j++) {
                    cnt = Math.min(arr[i] - arr[j], cnt);
                }
                for (int j = i + 1; j <= i + 2; j++) {
                    cnt = Math.min(arr[i] - arr[j], cnt);
                }

                if (cnt > 0) {
                    ret += cnt;
                }
            }

            sb.append('#').append(test_case).append(' ').append(ret);

            System.out.println(sb);
        }
    }
}