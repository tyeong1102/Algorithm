import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static int t, n;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = 1;

        for (int test_case = 1; test_case <= t; test_case++) {
            n = Integer.parseInt(br.readLine());

            String str = Integer.toString(n);

            int sum = 0;

            for (int i = 0; i < str.length(); i++) {
                int num = str.charAt(i) - '0';

                sum += num;
            }

            System.out.println(sum);
        }
    }
}