import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static int ret, t;
    public static int[][] arr;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for(int test_case = 1; test_case <= 10; test_case++) {
            t = Integer.parseInt(br.readLine());
            arr = new int[100][100];

            for (int i = 0; i < 100; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            ret = Integer.MIN_VALUE;

            for (int i = 0; i < 100; i++) {
                int rSum = 0;
                int cSum = 0;
                for (int j = 0; j < 100; j++) {
                    rSum += arr[i][j];
                    cSum += arr[j][i];
                }
                int max = 0;
                if (rSum > cSum) {
                    max = rSum;
                } else {
                    max = cSum;
                }

                ret = Math.max(ret, max);
            }

            int cross1 = 0;
            int cross2 = 0;
            for (int i = 0; i < 100; i++) {
                cross1 += arr[i][i];
            }
            ret = Math.max(ret, cross1);

            for (int i = 99; i >= 0; i--) {
                cross2 += arr[99 - i][i];
            }

            ret = Math.max(ret, cross2);

            sb.append("#").append(test_case).append(" ").append(ret).append("\n");
        }

        System.out.println(sb);
    }
}