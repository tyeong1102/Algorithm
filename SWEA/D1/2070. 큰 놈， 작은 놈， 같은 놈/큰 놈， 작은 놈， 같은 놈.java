import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static int t, a, b;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= t; test_case++) {
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            sb.append("#").append(test_case).append(" ");

            if (a < b) {
                sb.append("<");
            } else if (a > b) {
                sb.append(">");
            } else {
                sb.append("=");
            }

            System.out.println(sb);
        }
    }
}