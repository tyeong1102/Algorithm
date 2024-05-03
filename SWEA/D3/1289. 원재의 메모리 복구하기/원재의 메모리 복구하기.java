import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static int t, ret;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        t = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= t; test_case++) {
            String str = br.readLine();
            boolean check = false;
            ret = 0;

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == '1' && !check) {
                    check = true;
                    ret++;
                }
                if (c == '0' && check) {
                    ret++;
                    check = false;
                }
            }

            sb.append("#").append(test_case).append(" ").append(ret).append("\n");
        }

        System.out.println(sb);
    }
}