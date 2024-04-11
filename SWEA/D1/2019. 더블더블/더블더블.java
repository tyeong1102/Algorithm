import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static int t;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = 1;

        for (int test_case = 1; test_case <= t; test_case++) {

            int n = Integer.parseInt(br.readLine());

            StringBuilder sb = new StringBuilder();
            int num = 1;
            sb.append(num).append(" ");

            for (int i = 0; i < n; i++) {
                num *= 2;
                sb.append(num).append(" ");
            }

            System.out.println(sb);
        }
    }
}