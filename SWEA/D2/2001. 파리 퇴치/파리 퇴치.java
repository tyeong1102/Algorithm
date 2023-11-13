import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static int n, m, t;
    public static int[][] arr;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= t; test_case++) {
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            arr = new int[n][n];

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int ret = 0;
            for (int i = 0; i <= n - m; i++) {
                for (int j = 0; j <= n - m; j++) {
                    int sum = 0;
                    for (int x = 0; x < m; x++) {
                        for (int y = 0; y < m; y++) {
                            sum += arr[i + x][j + y];
                        }
                    }
                    ret = Math.max(sum, ret);
                }
            }
            sb.append('#').append(test_case).append(' ').append(ret);

            System.out.println(sb);
        }
    }
}