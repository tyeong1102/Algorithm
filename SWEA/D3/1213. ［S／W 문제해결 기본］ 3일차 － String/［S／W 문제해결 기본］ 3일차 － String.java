import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static int ret, t;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for(int test_case = 1; test_case <= 10; test_case++) {
            t = Integer.parseInt(br.readLine());
            String find = br.readLine();
            String str = br.readLine();

            int len = find.length();
            ret = 0;

            for (int i = 0; i <= str.length() - len; i++) {
                String check = str.substring(i, i + len);
                if (check.equals(find)) {
                    ret++;
                }
            }

            sb.append("#").append(test_case).append(" ").append(ret).append("\n");
        }

        System.out.println(sb);
    }
}