import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public static int t, ret;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        t = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= t; test_case++) {
            String str = br.readLine();

            int num = str.length();

            for (int i = 1; i <= num; i++) {
                String s1 = str.substring(0, i);
                String s2 = str.substring(i, i + s1.length());

                if (s1.equals(s2)) {
                    ret = s1.length();
                    break;
                }
            }

            sb.append("#").append(test_case).append(" ").append(ret).append("\n");
        }

        System.out.println(sb);
    }
}