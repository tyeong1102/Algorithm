import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static int t, n, ret;
    public static int[][] arr;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        t = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= t; test_case++) {
            n = Integer.parseInt(br.readLine());
            arr = new int[n][n];
            ret = 0;

            for (int i = 0; i < n; i++) {
                String str = br.readLine();
                for (int j = 0; j < n; j++) {
                    arr[i][j] = str.charAt(j) - '0';
                }
            }

            int s = n / 2;
            int e = n / 2;

            for (int i = 0; i < n / 2; i++) {
                for (int j = s; j <= e; j++) {
                    ret += arr[i][j];
                }
                s--;
                e++;
            }

            for (int i = n / 2; i < n; i++) {
                for (int j = s; j <= e; j++) {
                    ret += arr[i][j];
                }
                s++;
                e--;
            }

            sb.append("#").append(test_case).append(" ").append(ret).append("\n");

        }

        System.out.println(sb);
    }
}