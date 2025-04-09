import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int t, n;
    public static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());
        dp = new int[11];

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < 11; i++) {
            dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
        }

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());

            sb.append(dp[n]).append("\n");
        }

        System.out.println(sb);
    }
}