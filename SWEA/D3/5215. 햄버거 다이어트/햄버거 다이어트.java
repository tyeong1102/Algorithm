import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static int t, n, l, ret;
    public static int[][] arr;

    public static void go(int idx, int score, int cal) {
        if (cal > l) {
            return;
        }
        if (cal <= l) {
            ret = Math.max(ret, score);
        }
        if (idx == n) {
            return;
        }

        go(idx + 1, score, cal);
        go(idx + 1, score + arr[idx][0], cal + arr[idx][1]);
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        t = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= t; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            l = Integer.parseInt(st.nextToken());
            arr = new int[n][2];

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = Integer.parseInt(st.nextToken());
            }

            ret = 0;
            go(0,0, 0);

            sb.append("#").append(test_case).append(" ").append(ret).append("\n");
        }

        System.out.println(sb);
    }
}