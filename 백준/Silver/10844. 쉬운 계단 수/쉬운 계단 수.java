import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int n;
    public static long num = 1000000000;
    public static long[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        dp = new long[n+1][10];

        for (int i = 1; i < 10; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    dp[i][0] = dp[i - 1][1] % num;
                } else if (j == 9) {
                    dp[i][9] = dp[i - 1][8] % num;
                } else {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % num;
                }
            }
        }

        long ret = 0;

        for (int i = 0; i < 10; i++) {
            ret += dp[n][i];
        }

        System.out.println(ret % num);
    }
}