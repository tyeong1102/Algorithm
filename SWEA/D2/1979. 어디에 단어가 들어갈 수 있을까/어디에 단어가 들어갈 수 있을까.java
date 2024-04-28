import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static int t, n, k, cnt, ret;
    public static int[][] arr;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        t = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= t; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            arr = new int[n][n];

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            ret = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(arr[i][j] == 1) {
                        cnt++;
                    } else if (arr[i][j] == 0 && cnt > 0) {
                        if (cnt == k) {
                            ret++;
                        }
                        cnt = 0;
                    }
                }
                if (cnt == k) {
                    ret++;
                }
                cnt = 0;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[j][i] == 1) {
                        cnt++;
                    } else if (arr[j][i] == 0 && cnt > 0) {
                        if (cnt == k) {
                            ret++;
                        }
                        cnt = 0;
                    }
                }
                if (cnt == k) {
                    ret++;
                }
                cnt = 0;
            }

            sb.append("#").append(test_case).append(" ").append(ret).append("\n");
        }

        System.out.println(sb);
    }
}