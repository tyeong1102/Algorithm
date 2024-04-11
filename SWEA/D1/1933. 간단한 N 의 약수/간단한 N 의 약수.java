import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static int t;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = 1;

        for (int test_case = 1; test_case <= t; test_case++) {
            int n = Integer.parseInt(br.readLine());

            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sb.append(i).append(" ");
                }
            }

            System.out.println(sb);
        }
    }
}