import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static int n, ret;
    public static int[][] arr;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for(int test_case = 1; test_case <= 10; test_case++) {
            n = Integer.parseInt(br.readLine());
            arr = new int[n][n];
            ret = 0;

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i = 0; i < n; i++) {
                boolean check = false;
                for (int j = 0; j < n; j++) {
                    if (arr[j][i] == 1) {
                        check = true;
                    }
                    if (arr[j][i] == 2 && check) {
                        ret++;
                        check = false;
                    }
                }
            }
            sb.append("#").append(test_case).append(" ").append(ret).append("\n");
        }

        System.out.println(sb);
    }
}