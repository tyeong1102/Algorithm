import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public static int t, n;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        t = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= t; test_case++) {
            n = Integer.parseInt(br.readLine());

            sb.append("#").append(test_case).append(" ");

            int ret = 0;

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) {
                    ret += i;
                } else {
                    ret -= i;
                }
            }
            sb.append(ret).append("\n");
        }

        System.out.println(sb);
    }
}