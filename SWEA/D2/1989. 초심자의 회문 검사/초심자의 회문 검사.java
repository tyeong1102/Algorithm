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
            int num = str.length() / 2;

            boolean flag = true;

            for (int i = 0; i < num; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                ret = 1;
            } else {
                ret = 0;
            }

            sb.append("#").append(test_case).append(" ").append(ret).append("\n");
        }

        System.out.println(sb);
    }
}