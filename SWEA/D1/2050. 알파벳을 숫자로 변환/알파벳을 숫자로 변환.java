import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static int t;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = 1;

        for (int test_case = 1; test_case <= t; test_case++) {
            String str = br.readLine();

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                sb.append(str.charAt(i) - 64).append(" ");
            }

            System.out.println(sb);
        }
    }
}