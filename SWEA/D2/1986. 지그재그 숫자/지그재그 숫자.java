import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static int t, n;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= t; test_case++) {

            n = Integer.parseInt(br.readLine());

            int ret = 0;
            for(int i = 1; i <= n; i++) {
                if(i % 2 == 1) {
                    ret += i;
                } else {
                    ret -= i;
                }
            }

            System.out.println("#" + test_case + " " + ret);
        }
    }
}