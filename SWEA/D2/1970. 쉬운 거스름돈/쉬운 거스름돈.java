import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public static int t, n;
    public static int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        t = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= t; test_case++) {
            n = Integer.parseInt(br.readLine());

            sb.append("#").append(test_case).append("\n");

            for (int i = 0; i < money.length; i++) {
                sb.append(n / money[i]).append(" ");
                n %= money[i];
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}