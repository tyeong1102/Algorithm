import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n, m, t;
    public static int[][] dp;

    public static int combi(int m, int n) {
        if (dp[m][n] > 0) {
            return dp[m][n];
        }

        if (m == n || n == 0) {
            return dp[m][n] = 1;
        }

        return dp[m][n] = combi(m - 1, n - 1) + combi(m - 1, n);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        t = Integer.parseInt(br.readLine());
        dp = new int[30][30];

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            sb.append(combi(m, n)).append('\n');
        }

        System.out.println(sb);
    }
}