import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static int t, sum, ret;
    public static double tmp;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        t = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= t; test_case++) {
            sum = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 10; i++) {
                sum += Integer.parseInt(st.nextToken());
            }

            tmp = (double) sum / 10;
            ret = (int)Math.round(tmp);

            sb.append('#').append(test_case).append(' ').append(ret).append('\n');
        }
        System.out.println(sb);
    }
}